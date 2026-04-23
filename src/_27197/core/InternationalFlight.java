package _27197.core;

import java.util.Date;

public class InternationalFlight extends Flight {
    private double customsFee;
    private String passportRequirement;
    private boolean requiresVisas;

    public InternationalFlight() { super(); }

    public InternationalFlight(String entityId, String name, String status, Date createdDate, Date lastUpdated,
                               String flightNumber, String origin, String destination, double basePrice, int capacity,
                               double customsFee, String passportRequirement, boolean requiresVisas) {
        super(entityId, name, status, createdDate, lastUpdated, flightNumber, origin, destination, basePrice, capacity);
        this.customsFee = customsFee;
        this.passportRequirement = passportRequirement;
        this.requiresVisas = requiresVisas;
    }

    public double getCustomsFee() { return customsFee; }
    public void setCustomsFee(double customsFee) { this.customsFee = customsFee; }

    public String getPassportRequirement() { return passportRequirement; }
    public void setPassportRequirement(String passportRequirement) { this.passportRequirement = passportRequirement; }

    public boolean isRequiresVisas() { return requiresVisas; }
    public void setRequiresVisas(boolean requiresVisas) { this.requiresVisas = requiresVisas; }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + customsFee + 50.0; // Flat extra fee
    }

    @Override
    public String getFlightType() {
        return "International";
    }

    @Override
    public void validateEntity() {
        super.validateEntity();
        System.out.println("Validating customs and immigration requirements.");
    }
    
    @Override
    public void checkStatus() {
        super.checkStatus();
        System.out.println("Visa required: " + requiresVisas);
    }
}
