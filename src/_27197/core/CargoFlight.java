package _27197.core;

import java.util.Date;

public class CargoFlight extends Flight {
    private double maxLoadCapacity;
    private String cargoType;
    private boolean handlingHazardousMaterial;

    public CargoFlight() { super(); }

    public CargoFlight(String entityId, String name, String status, Date createdDate, Date lastUpdated,
                       String flightNumber, String origin, String destination, double basePrice, int capacity,
                       double maxLoadCapacity, String cargoType, boolean handlingHazardousMaterial) {
        super(entityId, name, status, createdDate, lastUpdated, flightNumber, origin, destination, basePrice, capacity);
        this.maxLoadCapacity = maxLoadCapacity;
        this.cargoType = cargoType;
        this.handlingHazardousMaterial = handlingHazardousMaterial;
    }

    public double getMaxLoadCapacity() { return maxLoadCapacity; }
    public void setMaxLoadCapacity(double maxLoadCapacity) { this.maxLoadCapacity = maxLoadCapacity; }

    public String getCargoType() { return cargoType; }
    public void setCargoType(String cargoType) { this.cargoType = cargoType; }

    public boolean isHandlingHazardousMaterial() { return handlingHazardousMaterial; }
    public void setHandlingHazardousMaterial(boolean handlingHazardousMaterial) { this.handlingHazardousMaterial = handlingHazardousMaterial; }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() * (maxLoadCapacity / 1000); // Pricing based on weight
    }

    @Override
    public String getFlightType() {
        return "Cargo";
    }

    @Override
    public void generateReport() {
        super.generateReport();
        System.out.println("Cargo Type: " + cargoType + ", Hazardous: " + handlingHazardousMaterial);
    }
    
    @Override
    public void logActivity() {
        System.out.println("Logging cargo loading/unloading for " + getFlightNumber());
    }
}
