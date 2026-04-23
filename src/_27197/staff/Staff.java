package _27197.staff;

public class Staff {

    private String staffId;
    private String name;
    private String role;
    private double salary;

    public Staff(String staffId, String name, String role, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getStaffId() { return staffId; }
    public String getName() { return name; }
    public String getRole() { return role; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Staff: " + name + ", Role: " + role + ", Salary: " + salary;
    }
}