package _27197.passenger;

import _27197.core.Flight;

public class Ticket {

    private String ticketId;
    private Passenger passenger;
    private Flight flight;
    private String seatNumber;
    private String classType; // Economy, Business, First
    private double price;


    public Ticket(String ticketId, Passenger passenger, Flight flight,
                  String seatNumber, String classType, double price) {
        this.ticketId = ticketId;
        this.passenger = passenger;
        this.flight = flight;
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.price = price;
    }


    public double calculateTicketPrice() {
        if (classType.equalsIgnoreCase("Business")) {
            return price * 1.5;
        } else if (classType.equalsIgnoreCase("First")) {
            return price * 2;
        }
        return price;
    }


    public void generateTicketDetails() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println(passenger);
        System.out.println(flight);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Class: " + classType);
        System.out.println("Price: " + calculateTicketPrice());
    }
}