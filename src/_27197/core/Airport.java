package _27197.core;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Airport extends AirportEntity {
    private String code;
    private String city;
    private String country;
    private List<Terminal> terminals;

    public Airport() { 
        super(); 
        this.terminals = new ArrayList<>();
    }

    public Airport(String entityId, String name, String status, Date createdDate, Date lastUpdated,
                   String code, String city, String country) {
        super(entityId, name, status, createdDate, lastUpdated);
        this.code = code;
        this.city = city;
        this.country = country;
        this.terminals = new ArrayList<>();
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public List<Terminal> getTerminals() { return terminals; }
    public void addTerminal(Terminal terminal) { this.terminals.add(terminal); }

    @Override public void validateEntity() { System.out.println("Validating Airport " + code); }
    @Override public void activateEntity() { setStatus("Active"); }
    @Override public void deactivateEntity() { setStatus("Inactive"); }
    @Override public void updateDetails() { System.out.println("Updating details for Airport " + code); }
    @Override public void generateReport() { System.out.println("Generating report for Airport " + code); }
    @Override public void logActivity() { System.out.println("Logging activity for Airport " + code); }
    @Override public void checkStatus() { System.out.println("Airport " + code + " status: " + getStatus()); }
    @Override public void archiveEntity() { System.out.println("Archiving Airport " + code); }
    @Override public void restoreEntity() { System.out.println("Restoring Airport " + code); }
    @Override public void displaySummary() { System.out.println(this.toString()); }

    @Override
    public String toString() {
        return super.toString() + ", Code: " + code + ", Location: " + city + ", " + country;
    }
}
