package com.intelbras.cadastrarusario;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioWrapper {
    @JsonProperty("UserList")
    private List<Usuario> userList;

    public List<Usuario> getUserList() {
        return userList;
    }

    public void setUserList(List<Usuario> userList) {
        this.userList = userList;
    }
}
