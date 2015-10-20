package com.qinxiandiqi.restonline.domain;

/**
 * Created by Jianan on 10/20/15.
 */
public class User {

    private String username;
    private char[] password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
}
