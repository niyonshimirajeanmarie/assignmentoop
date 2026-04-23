package _27197.staff;

public class SecurityOfficer extends Staff {

    private String securityLevel;

    public SecurityOfficer(String staffId, String name, double salary, String securityLevel) {
        super(staffId, name, "Security Officer", salary);
        this.securityLevel = securityLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Security Level: " + securityLevel;
    }
}