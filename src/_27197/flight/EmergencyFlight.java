package _27197.flight;

import java.time.LocalDateTime;

public class EmergencyFlight extends Flight {

    private String emergencyLevel;

    public EmergencyFlight(String flightId, String airlineName, String departureLocation,
                           String destination, LocalDateTime departureTime,
                           LocalDateTime arrivalTime, int capacity, String emergencyLevel) {

        super(flightId, airlineName, departureLocation, destination, departureTime, arrivalTime, capacity);
        this.emergencyLevel = emergencyLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Emergency Level: " + emergencyLevel;
    }

    public void displayType() {
        System.out.println("Emergency Flight");
    }
}