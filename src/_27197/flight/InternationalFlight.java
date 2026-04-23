package _27197.flight;

import java.time.LocalDateTime;

public class InternationalFlight extends Flight {

    private boolean passportRequired;

    public InternationalFlight(String flightId, String airlineName, String departureLocation,
                               String destination, LocalDateTime departureTime,
                               LocalDateTime arrivalTime, int capacity, boolean passportRequired) {

        super(flightId, airlineName, departureLocation, destination, departureTime, arrivalTime, capacity);
        this.passportRequired = passportRequired;
    }

    @Override
    public long calculateDuration() {
        return super.calculateDuration() + 1; // extra time for customs
    }

    @Override
    public String toString() {
        return super.toString() + ", Passport Required: " + passportRequired;
    }

    public void displayType() {
        System.out.println("International Flight");
    }
}