package _27197.staff;

public class Pilot extends Staff {

    private int flightHours;

    public Pilot(String staffId, String name, double salary, int flightHours) {
        super(staffId, name, "Pilot", salary);
        this.flightHours = flightHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", Flight Hours: " + flightHours;
    }
}