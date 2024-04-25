package org.example.models;

public class Operator extends User {
    private String operatorId;

    public Operator(String name, String email, String phoneNumber, String operatorId) {
        super(name, email, phoneNumber);
        this.operatorId = operatorId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

}
