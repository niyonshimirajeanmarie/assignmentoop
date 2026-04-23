package _27197.flight;

import java.time.LocalDateTime;

public class CargoFlight extends Flight {

    private double cargoWeightLimit;

    public CargoFlight(String flightId, String airlineName, String departureLocation,
                       String destination, LocalDateTime departureTime,
                       LocalDateTime arrivalTime, int capacity, double cargoWeightLimit) {

        super(flightId, airlineName, departureLocation, destination, departureTime, arrivalTime, capacity);
        this.cargoWeightLimit = cargoWeightLimit;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo Limit: " + cargoWeightLimit + " kg";
    }

    public void displayType() {
        System.out.println("Cargo Flight");
    }
}