package com.intelbras.cadastrarusario;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Cadastro {

    // updateMulti
    private static final String IP = "192.168.1.49";
    private static final String POST_URL = "http://" + IP + "/cgi-bin/AccessUser.cgi?action=insertMulti";
    private static final String GET_URL = "http://" + IP + "/cgi-bin/recordUpdater.cgi?action=insert&name=AccessControlCard&CardNo=AF79FCC9&CardStatus=0&CardName=AlexandreAlves&UserID=15&Password=112233&ValidDateStart=20151022%20093811&ValidDateEnd=20151222%20093811";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "Ec0ground";
    private static final HttpClient client = HttpClient.newHttpClient();
    
    public void sendAndGetUser() throws Exception {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("UsuarioDados.json");
        if (inputStream == null) {
            throw new FileNotFoundException("Arquivo UsuarioDados.json não encontrado em resources.");
        }
        ObjectMapper mapper = new ObjectMapper();
        UsuarioWrapper usuario = mapper.readValue(inputStream, UsuarioWrapper.class);
        String json = mapper.writeValueAsString(usuario);

        /*
         * Na API da Intelbras, o GET é quem insere dados e não o POST
         */
        HttpResponse<String> responseGet = sendWithDigestAuth(GET_URL, "GET", null);
        System.out.println("[GET] Status: " + responseGet.statusCode());
        System.out.println("[GET] Body: " + responseGet.body());

        //POST tradicional para cadastrar usuários com JSON no Body da aplicação
        HttpResponse<String> responsePost = sendWithDigestAuth(POST_URL, "POST", json);
        System.out.println("[POST] Status: " + responsePost.statusCode());
        System.out.println("[POST] Body: " + responsePost.body());

    }

    public static HttpResponse<String> sendWithDigestAuth(String url, String method, String jsonBody) throws Exception {
        URI uri = URI.create(url);
        HttpRequest.Builder reqBuilder = HttpRequest.newBuilder().uri(uri).method(method,
                HttpRequest.BodyPublishers.noBody());

        if ("POST".equalsIgnoreCase(method) && jsonBody != null) {
            reqBuilder = HttpRequest.newBuilder()
                    .uri(uri)
                    .header("Content-Type", "application/json")
                    .method("POST", HttpRequest.BodyPublishers.ofString(jsonBody));
        }

        HttpResponse<String> resp401 = client.send(reqBuilder.build(), HttpResponse.BodyHandlers.ofString());

        if (resp401.statusCode() != 401) {
            System.out.println("Esperava 401, código recebido: " + resp401.statusCode());
            return resp401;
        }

        String authHeader = resp401.headers()
                .firstValue("WWW-Authenticate")
                .orElseThrow(() -> new RuntimeException("WWW-Authenticate não encontrado"));

        Map<String, String> authParams = parseDigestHeader(authHeader);

        String realm = authParams.get("realm");
        String nonce = authParams.get("nonce");
        String qop = authParams.get("qop");
        String opaque = authParams.get("opaque");
        // String method = "POST";
        // String uriPath = URI.create(SEND_URL).getPath();
        String nc = "00000001";
        String cnonce = UUID.randomUUID().toString().replace("-", "").substring(0, 16);
        String pathOnly = uri.getRawPath();

        String ha1 = md5(USERNAME + ":" + realm + ":" + PASSWORD);
        String ha2 = md5(method + ":" + pathOnly);
        String response = md5(ha1 + ":" + nonce + ":" + nc + ":" + cnonce + ":" + qop + ":" + ha2);

        String authorization = String.format(
                "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", qop=%s, nc=%s, cnonce=\"%s\", response=\"%s\", opaque=\"%s\"",
                USERNAME, realm, nonce, pathOnly, qop, nc, cnonce, response, opaque);

        HttpRequest.Builder authRequest = HttpRequest.newBuilder()
                .uri(uri)
                .header("Content-Type", "application/json")
                .header("Authorization", authorization)
                .method(method,
                jsonBody != null ? HttpRequest.BodyPublishers.ofString(jsonBody) : HttpRequest.BodyPublishers.noBody());

        return client.send(authRequest.build(), HttpResponse.BodyHandlers.ofString());
    }

    private static Map<String, String> parseDigestHeader(String header) {
        Map<String, String> map = new HashMap<>();
        Matcher matcher = Pattern.compile("(\\w+)=\"?([^\"]+)\"?").matcher(header);
        while (matcher.find()) {
            map.put(matcher.group(1), matcher.group(2));
        }
        return map;
    }

    private static String md5(String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(input.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

}
