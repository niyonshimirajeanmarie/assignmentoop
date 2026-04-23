package _27197.services;

import _27197.passenger.Passenger;

public class Baggage {

    private String baggageId;
    private double weight;
    private Passenger owner;
    private String status;

    public Baggage(String baggageId, double weight, Passenger owner, String status) {
        this.baggageId = baggageId;
        this.weight = weight;
        this.owner = owner;
        this.status = status;
    }

    public void checkWeight() {
        if (weight > 50) {
            System.out.println("Overweight baggage!");
        } else {
            System.out.println("Baggage weight OK");
        }
    }
}