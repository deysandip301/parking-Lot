package org.example.models;

import java.util.List;

public class Bill {
    private int id;
    private ParkingTicket ticket;
    private String exitTime;
    private double amount;
    private Gate exitGate;
    private List<Payment> payments;
    private BillStatus billStatus;
}
