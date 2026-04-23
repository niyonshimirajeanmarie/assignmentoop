package _27197.flight;

import java.time.LocalDateTime;

public class CharterFlight extends Flight {

    private String privateClientName;

    public CharterFlight(String flightId, String airlineName, String departureLocation,
                         String destination, LocalDateTime departureTime,
                         LocalDateTime arrivalTime, int capacity, String privateClientName) {

        super(flightId, airlineName, departureLocation, destination, departureTime, arrivalTime, capacity);
        this.privateClientName = privateClientName;
    }

    @Override
    public String toString() {
        return super.toString() + ", Client: " + privateClientName;
    }

    public void displayType() {
        System.out.println("Charter Flight");
    }
}