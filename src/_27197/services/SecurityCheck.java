package _27197.services;

import _27197.passenger.Passenger;

public class SecurityCheck {

    private String checkId;
    private Passenger passenger;
    private String status;
    private String remarks;

    public SecurityCheck(String checkId, Passenger passenger, String status, String remarks) {
        this.checkId = checkId;
        this.passenger = passenger;
        this.status = status;
        this.remarks = remarks;
    }

    public void performCheck() {
        System.out.println("Security check completed for " + passenger.getFullName());
    }
}