package com.demoWebShop.models;

public class Contact {
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    private String confirmpassword;

    public Contact setEmail(String email) {
        this.email = email;
        return this;
    }

    public Contact setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public Contact setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public Contact setPassword(String password) {
        this.password = password;
        return this;
    }

    public Contact setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }
}

