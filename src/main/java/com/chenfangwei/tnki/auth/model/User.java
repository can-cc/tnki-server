package com.chenfangwei.tnki.auth.model;

import com.chenfangwei.tnki.share.model.BaseAggregate;

import java.util.Set;

public class User extends BaseAggregate {
    private Long ID;

    private String username;

    private String password;

    public Long getID() {
        return ID;
    }

    public void setId(Long id) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}