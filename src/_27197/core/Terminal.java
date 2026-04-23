package _27197.core;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Terminal extends AirportEntity {
    private int terminalId;
    private String terminalName;
    private List<Gate> gates;

    public Terminal() { 
        super();
        this.gates = new ArrayList<>();
    }

    public Terminal(String entityId, String name, String status, Date createdDate, Date lastUpdated,
                    int terminalId, String terminalName) {
        super(entityId, name, status, createdDate, lastUpdated);
        this.terminalId = terminalId;
        this.terminalName = terminalName;
        this.gates = new ArrayList<>();
    }

    public int getTerminalId() { return terminalId; }
    public void setTerminalId(int terminalId) { this.terminalId = terminalId; }

    public String getTerminalName() { return terminalName; }
    public void setTerminalName(String terminalName) { this.terminalName = terminalName; }

    public List<Gate> getGates() { return gates; }
    public void addGate(Gate gate) { this.gates.add(gate); }

    @Override public void validateEntity() { System.out.println("Validating Terminal " + terminalId); }
    @Override public void activateEntity() { setStatus("Active"); }
    @Override public void deactivateEntity() { setStatus("Inactive"); }
    @Override public void updateDetails() { System.out.println("Updating details for Terminal " + terminalId); }
    @Override public void generateReport() { System.out.println("Generating report for Terminal " + terminalId); }
    @Override public void logActivity() { System.out.println("Logging activity for Terminal " + terminalId); }
    @Override public void checkStatus() { System.out.println("Terminal " + terminalId + " status: " + getStatus()); }
    @Override public void archiveEntity() { System.out.println("Archiving Terminal " + terminalId); }
    @Override public void restoreEntity() { System.out.println("Restoring Terminal " + terminalId); }
    @Override public void displaySummary() { System.out.println(this.toString()); }

    @Override
    public String toString() {
        return super.toString() + ", TerminalId: " + terminalId + ", TerminalName: " + terminalName;
    }
}
