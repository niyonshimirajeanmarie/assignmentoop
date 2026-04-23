package _27197.core;

import java.util.Date;

public abstract class AirportEntity {
    private String entityId;
    private String name;
    private String status;
    private Date createdDate;
    private Date lastUpdated;

    public AirportEntity() {
        this.createdDate = new Date();
        this.lastUpdated = new Date();
        this.status = "Inactive";
    }

    public AirportEntity(String entityId, String name, String status, Date createdDate, Date lastUpdated) {
        this.entityId = entityId;
        this.name = name;
        this.status = status;
        this.createdDate = createdDate;
        this.lastUpdated = lastUpdated;
    }


    public String getEntityId() { return entityId; }
    public void setEntityId(String entityId) { this.entityId = entityId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Date getCreatedDate() { return createdDate; }
    public void setCreatedDate(Date createdDate) { this.createdDate = createdDate; }

    public Date getLastUpdated() { return lastUpdated; }
    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }

    @Override
    public String toString() {
        return "EntityID: " + entityId + ", Name: " + name + ", Status: " + status;
    }


    public abstract void validateEntity();
    public abstract void activateEntity();
    public abstract void deactivateEntity();
    public abstract void updateDetails();
    public abstract void generateReport();
    public abstract void logActivity();
    public abstract void checkStatus();
    public abstract void archiveEntity();
    public abstract void restoreEntity();
    public abstract void displaySummary();
}