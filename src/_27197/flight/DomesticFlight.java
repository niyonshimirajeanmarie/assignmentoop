package _27197.flight;

import java.time.LocalDateTime;

public class DomesticFlight extends Flight {

    private String regionCode;

    public DomesticFlight(String flightId, String airlineName, String departureLocation,
                          String destination, LocalDateTime departureTime,
                          LocalDateTime arrivalTime, int capacity, String regionCode) {

        super(flightId, airlineName, departureLocation, destination, departureTime, arrivalTime, capacity);
        this.regionCode = regionCode;
    }

    @Override
    public long calculateDuration() {
        return super.calculateDuration();
    }

    @Override
    public String toString() {
        return super.toString() + ", Region: " + regionCode;
    }

    public void displayType() {
        System.out.println("Domestic Flight");
    }
}