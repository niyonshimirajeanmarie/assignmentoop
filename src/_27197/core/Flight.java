package _27197.core;

import _27197.interfaces.Trackable;
import java.util.Date;

public abstract class Flight extends AirportEntity implements Trackable {
    private String flightNumber;
    private String origin;
    private String destination;
    private double basePrice;
    private int capacity;
    private String currentLocation;

    public Flight() {
        super();
    }

    public Flight(String entityId, String name, String status, Date createdDate, Date lastUpdated,
                  String flightNumber, String origin, String destination, double basePrice, int capacity) {
        super(entityId, name, status, createdDate, lastUpdated);
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.basePrice = basePrice;
        this.capacity = capacity;
        this.currentLocation = origin;
    }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public double getBasePrice() { return basePrice; }
    public void setBasePrice(double basePrice) { this.basePrice = basePrice; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    @Override
    public void trackStatus() {
        System.out.println("Flight " + flightNumber + " is currently " + getStatus());
    }

    @Override
    public void updateLocation(String location) {
        this.currentLocation = location;
        System.out.println("Flight " + flightNumber + " location updated to " + location);
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Common abstract methods from AirportEntity
    @Override public void validateEntity() { System.out.println("Validating Flight " + flightNumber); }
    @Override public void activateEntity() { setStatus("Active"); }
    @Override public void deactivateEntity() { setStatus("Inactive"); }
    @Override public void updateDetails() { System.out.println("Updating details for Flight " + flightNumber); }
    @Override public void generateReport() { System.out.println("Generation Report for " + flightNumber); }
    @Override public void logActivity() { System.out.println("Activity logged for " + flightNumber); }
    @Override public void checkStatus() { System.out.println(flightNumber + " status: " + getStatus()); }
    @Override public void archiveEntity() { System.out.println("Archiving Flight " + flightNumber); }
    @Override public void restoreEntity() { System.out.println("Restoring Flight " + flightNumber); }
    @Override public void displaySummary() { System.out.println(this.toString()); }

    @Override
    public String toString() {
        return super.toString() + ", FlightNumber: " + flightNumber + ", Origin: " + origin + ", Dest: " + destination;
    }

    public abstract double calculateFinalPrice();
    public abstract String getFlightType();
}
