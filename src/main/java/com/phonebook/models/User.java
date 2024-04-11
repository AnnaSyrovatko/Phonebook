package com.phonebook.models;

public class User {
    private String password;
    private String email;

    public User setEmail(String email){
        this.email = email;
        return this;
    }
    public User setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword(){
        return password;
    }
}
