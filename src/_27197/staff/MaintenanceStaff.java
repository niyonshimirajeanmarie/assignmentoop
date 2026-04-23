package _27197.staff;

public class MaintenanceStaff extends Staff {

    private String specialization;

    public MaintenanceStaff(String staffId, String name, double salary, String specialization) {
        super(staffId, name, "Maintenance Staff", salary);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialization: " + specialization;
    }
}