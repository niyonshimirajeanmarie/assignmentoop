package _27197.core;

import java.util.Date;

public class CharterFlight extends Flight {
    private String charterCompany;
    private boolean requiresSpecialCatering;
    private double charterFee;

    public CharterFlight() { super(); }

    public CharterFlight(String entityId, String name, String status, Date createdDate, Date lastUpdated,
                         String flightNumber, String origin, String destination, double basePrice, int capacity,
                         String charterCompany, boolean requiresSpecialCatering, double charterFee) {
        super(entityId, name, status, createdDate, lastUpdated, flightNumber, origin, destination, basePrice, capacity);
        this.charterCompany = charterCompany;
        this.requiresSpecialCatering = requiresSpecialCatering;
        this.charterFee = charterFee;
    }

    public String getCharterCompany() { return charterCompany; }
    public void setCharterCompany(String charterCompany) { this.charterCompany = charterCompany; }

    public boolean isRequiresSpecialCatering() { return requiresSpecialCatering; }
    public void setRequiresSpecialCatering(boolean requiresSpecialCatering) { this.requiresSpecialCatering = requiresSpecialCatering; }

    public double getCharterFee() { return charterFee; }
    public void setCharterFee(double charterFee) { this.charterFee = charterFee; }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + charterFee;
    }

    @Override
    public String getFlightType() {
        return "Charter";
    }

    @Override
    public void archiveEntity() {
        System.out.println("Archiving charter details for company " + charterCompany);
        super.archiveEntity();
    }
    
    @Override
    public void displaySummary() {
        super.displaySummary();
        System.out.println("Charter Company: " + charterCompany);
    }
}
