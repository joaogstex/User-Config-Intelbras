package com.intelbras.cadastrarusario;

import com.intelbras.cadastrarusario.controller.Cadastro;

public class Main {
    public static void main(String[] args) throws Exception {
        Cadastro cadastro = new Cadastro();
        cadastro.processarCadastroUsuario();
        //cadastro.obterTodosUsuarios();
        //cadastro.acessarUsuarioInfo();
        //cadastro.obterUsuarioPorCardNo();
        //cadastro.obterUsuarioRecNo();
        //cadastro.obterUsuarioPorId();
        //cadastro.removerUsuarioPorId();
    }
}