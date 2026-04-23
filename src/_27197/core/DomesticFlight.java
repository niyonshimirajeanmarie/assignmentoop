package _27197.core;

import java.util.Date;

public class DomesticFlight extends Flight {
    private double domesticTax;
    private boolean isRegional;
    private String stateCarrierCode;

    public DomesticFlight() { super(); }

    public DomesticFlight(String entityId, String name, String status, Date createdDate, Date lastUpdated,
                          String flightNumber, String origin, String destination, double basePrice, int capacity,
                          double domesticTax, boolean isRegional, String stateCarrierCode) {
        super(entityId, name, status, createdDate, lastUpdated, flightNumber, origin, destination, basePrice, capacity);
        this.domesticTax = domesticTax;
        this.isRegional = isRegional;
        this.stateCarrierCode = stateCarrierCode;
    }

    public double getDomesticTax() { return domesticTax; }
    public void setDomesticTax(double domesticTax) { this.domesticTax = domesticTax; }

    public boolean isRegional() { return isRegional; }
    public void setRegional(boolean regional) { this.isRegional = regional; }

    public String getStateCarrierCode() { return stateCarrierCode; }
    public void setStateCarrierCode(String stateCarrierCode) { this.stateCarrierCode = stateCarrierCode; }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + domesticTax;
    }

    @Override
    public String getFlightType() {
        return "Domestic";
    }

    @Override
    public void updateDetails() {
        System.out.println("Updating domestic tax and regional status for " + getFlightNumber());
    }
    
    @Override
    public void displaySummary() {
        super.displaySummary();
        System.out.println("Type: " + getFlightType() + ", State Code: " + stateCarrierCode);
    }
}
