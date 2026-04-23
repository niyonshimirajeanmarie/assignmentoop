package _27197.core;

import _27197.interfaces.Reservable;
import _27197.interfaces.Payable;
import _27197.interfaces.Trackable;
import java.util.Date;

public class AirportManager extends AirportEntity implements Reservable, Payable, Trackable {
    private String airportName;
    private int terminalNumber;
    private String managerName;
    private String currentLocation;

    public AirportManager() { super(); }

    public AirportManager(String entityId, String name, String status, Date createdDate, Date lastUpdated,
                          String airportName, int terminalNumber, String managerName) {
        super(entityId, name, status, createdDate, lastUpdated);
        this.airportName = airportName;
        this.terminalNumber = terminalNumber;
        this.managerName = managerName;
        this.currentLocation = "Office";
    }

    // Getters and Setters
    public String getAirportName() { return airportName; }
    public void setAirportName(String airportName) { this.airportName = airportName; }

    public int getTerminalNumber() { return terminalNumber; }
    public void setTerminalNumber(int terminalNumber) { this.terminalNumber = terminalNumber; }

    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) { this.managerName = managerName; }

    public String getCurrentLocation() { return currentLocation; }

    // Abstract Methods Implementation
    @Override public void validateEntity() { System.out.println("Validating AirportManager..."); }
    @Override public void activateEntity() { setStatus("Active"); }
    @Override public void deactivateEntity() { setStatus("Inactive"); }
    @Override public void updateDetails() { System.out.println("Updating AirportManager details..."); }
    @Override public void generateReport() { System.out.println("Generating report..."); }
    @Override public void logActivity() { System.out.println("Logging activity..."); }
    @Override public void checkStatus() { System.out.println("Status: " + getStatus()); }
    @Override public void archiveEntity() { System.out.println("Archiving AirportManager..."); }
    @Override public void restoreEntity() { System.out.println("Restoring AirportManager..."); }
    @Override public void displaySummary() { System.out.println(this.toString()); }

    // Reservable
    @Override public void createReservation() { System.out.println("Reservation created."); }
    @Override public void cancelReservation() { System.out.println("Reservation canceled."); }
    @Override public void modifyReservation() { System.out.println("Reservation modified."); }

    // Payable
    @Override public void processPayment() { System.out.println("Processing payment..."); }
    @Override public double calculateAmount() { return 1000.0; }
    @Override public void generateReceipt() { System.out.println("Receipt generated."); }

    // Trackable
    @Override public void trackStatus() { System.out.println("Tracking status..."); }
    @Override public void updateLocation(String location) { this.currentLocation = location; }
}