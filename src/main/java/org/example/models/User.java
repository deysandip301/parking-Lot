package org.example.models;

public class User {
    private int id;
    private String name;
    private String email;
    private String phone;
    private Address address;

    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

}
