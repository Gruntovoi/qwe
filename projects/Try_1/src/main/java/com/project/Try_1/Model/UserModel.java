package com.project.Try_1.Model;

public class UserModel {
    private int id;
    private String Username;
    private String Userpassword;
    public UserModel(){}

    public UserModel(int id, String username, String userpassword) {
        this.id = id;
        Username = username;
        Userpassword = userpassword;
    }

    public String getUserpassword() {
        return Userpassword;
    }

    public void setUserpassword(String userpassword) {
        Userpassword = userpassword;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
