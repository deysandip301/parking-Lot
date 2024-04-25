package org.example.models;

public class Customer extends User{
    private String userId;
    private String password;
    private Vehicle vehicle;
    private Payment payment;
    private ParkingTicket ticket;



    public Customer(String name, String email, String phone) {
        super(name, email, phone);
    }
}
