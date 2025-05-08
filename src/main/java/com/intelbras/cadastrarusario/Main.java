package com.intelbras.cadastrarusario;

import com.intelbras.cadastrarusario.controller.Cadastro;

public class Main {
    public static void main(String[] args) throws Exception {
        Cadastro cadastro = new Cadastro();
        //cadastro.sendAndGetUser();
        //cadastro.obterTodosUsuarios();
        //cadastro.acessarUsuarioInfo();
        cadastro.obterUsuarioPorCardNo();
    }
}