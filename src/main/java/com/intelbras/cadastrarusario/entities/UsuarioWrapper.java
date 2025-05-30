package com.intelbras.cadastrarusario.entities;
 
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

    @Override
    public String toString() {
        return "UsuarioWrapper [userList=" + userList + "]";
    }

}

