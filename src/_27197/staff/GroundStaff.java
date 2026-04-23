package _27197.staff;

public class GroundStaff extends Staff {

    private String department;

    public GroundStaff(String staffId, String name, double salary, String department) {
        super(staffId, name, "Ground Staff", salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}