package com.example.rozrachunki.model;

public class User {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private boolean hasAccount = true;

    public User(Integer id, String username, String email, String password, String phoneNumber, Boolean hasAccount) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.hasAccount = hasAccount;
    }

    public User() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isHasAccount() { return hasAccount; }

    public void setHasAccount(boolean hasAccount) { this.hasAccount = hasAccount; }
}
