package _27197.core;

import java.util.Date;

public class Gate extends AirportEntity {
    private String gateNumber;
    private boolean isAvailable;
    private String supportedAircraftType;

    public Gate() { super(); }

    public Gate(String entityId, String name, String status, Date createdDate, Date lastUpdated,
                String gateNumber, boolean isAvailable, String supportedAircraftType) {
        super(entityId, name, status, createdDate, lastUpdated);
        this.gateNumber = gateNumber;
        this.isAvailable = isAvailable;
        this.supportedAircraftType = supportedAircraftType;
    }

    public String getGateNumber() { return gateNumber; }
    public void setGateNumber(String gateNumber) { this.gateNumber = gateNumber; }

    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public String getSupportedAircraftType() { return supportedAircraftType; }
    public void setSupportedAircraftType(String supportedAircraftType) { this.supportedAircraftType = supportedAircraftType; }

    @Override public void validateEntity() { System.out.println("Validating Gate " + gateNumber); }
    @Override public void activateEntity() { setStatus("Active"); setAvailable(true); }
    @Override public void deactivateEntity() { setStatus("Inactive"); setAvailable(false); }
    @Override public void updateDetails() { System.out.println("Updating details for Gate " + gateNumber); }
    @Override public void generateReport() { System.out.println("Generating report for Gate " + gateNumber); }
    @Override public void logActivity() { System.out.println("Logging activity for Gate " + gateNumber); }
    @Override public void checkStatus() { System.out.println("Gate " + gateNumber + " isAvailable: " + isAvailable); }
    @Override public void archiveEntity() { System.out.println("Archiving Gate " + gateNumber); }
    @Override public void restoreEntity() { System.out.println("Restoring Gate " + gateNumber); }
    @Override public void displaySummary() { System.out.println(this.toString()); }

    @Override
    public String toString() {
        return super.toString() + ", GateNumber: " + gateNumber + ", Available: " + isAvailable;
    }
}
