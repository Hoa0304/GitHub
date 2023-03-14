package com.ttchoa22ite.population.models;


public final class Admin {
    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}

