package _27197.core;

import java.util.Date;

public class EmergencyFlight extends Flight {
    private String emergencyType;
    private int priorityLevel;
    private String requestingAgency;

    public EmergencyFlight() { super(); }

    public EmergencyFlight(String entityId, String name, String status, Date createdDate, Date lastUpdated,
                           String flightNumber, String origin, String destination, double basePrice, int capacity,
                           String emergencyType, int priorityLevel, String requestingAgency) {
        super(entityId, name, status, createdDate, lastUpdated, flightNumber, origin, destination, basePrice, capacity);
        this.emergencyType = emergencyType;
        this.priorityLevel = priorityLevel;
        this.requestingAgency = requestingAgency;
    }

    public String getEmergencyType() { return emergencyType; }
    public void setEmergencyType(String emergencyType) { this.emergencyType = emergencyType; }

    public int getPriorityLevel() { return priorityLevel; }
    public void setPriorityLevel(int priorityLevel) { this.priorityLevel = priorityLevel; }

    public String getRequestingAgency() { return requestingAgency; }
    public void setRequestingAgency(String requestingAgency) { this.requestingAgency = requestingAgency; }

    @Override
    public double calculateFinalPrice() {
        return 0; // Emergency flights are usually not charged to passengers
    }

    @Override
    public String getFlightType() {
        return "Emergency";
    }

    @Override
    public void activateEntity() {
        System.out.println("EMERGENCY FLIGHT ACTIVATED! Priority: " + priorityLevel);
        setStatus("Active - EMERGENCY");
    }
    
    @Override
    public void trackStatus() {
        System.out.println("URGENT TRACKING: Flight " + getFlightNumber() + " Agency: " + requestingAgency);
    }
}
