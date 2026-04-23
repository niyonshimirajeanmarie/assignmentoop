package _27197.flight;

import java.time.Duration;
import java.time.LocalDateTime;

public class Flight {

    private String flightId;
    private String airlineName;
    private String departureLocation;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int capacity;


    public Flight(String flightId, String airlineName, String departureLocation,
                  String destination, LocalDateTime departureTime,
                  LocalDateTime arrivalTime, int capacity) {

        this.flightId = flightId;
        this.airlineName = airlineName;
        this.departureLocation = departureLocation;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.capacity = capacity;
    }


    public String getFlightId() { return flightId; }
    public void setFlightId(String flightId) { this.flightId = flightId; }

    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) { this.airlineName = airlineName; }

    public String getDepartureLocation() { return departureLocation; }
    public String getDestination() { return destination; }

    public LocalDateTime getDepartureTime() { return departureTime; }
    public LocalDateTime getArrivalTime() { return arrivalTime; }

    public int getCapacity() { return capacity; }


    public long calculateDuration() {
        return Duration.between(departureTime, arrivalTime).toHours();
    }


    @Override
    public String toString() {
        return "Flight ID: " + flightId +
                ", Airline: " + airlineName +
                ", From: " + departureLocation +
                ", To: " + destination +
                ", Duration: " + calculateDuration() + " hrs";
    }
}