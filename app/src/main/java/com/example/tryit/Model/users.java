package com.example.tryit.Model;

public class users {
    private String id;
    private String username;
    private String ImagerURL;

    public users(String id, String username, String imagerURL) {
        this.id = id;
        this.username = username;
        ImagerURL = imagerURL;
    }

    public users() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImagerURL() {
        return ImagerURL;
    }

    public void setImagerURL(String imagerURL) {
        ImagerURL = imagerURL;
    }
}
