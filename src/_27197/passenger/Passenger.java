package _27197.passenger;

public class Passenger {

    private String passengerId;
    private String fullName;
    private String passportNumber;
    private String nationality;
    private String phoneNumber;


    public Passenger(String passengerId, String fullName, String passportNumber,
                     String nationality, String phoneNumber) {
        this.passengerId = passengerId;
        this.fullName = fullName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
    }


    public String getPassengerId() { return passengerId; }
    public String getFullName() { return fullName; }
    public String getPassportNumber() { return passportNumber; }
    public String getNationality() { return nationality; }
    public String getPhoneNumber() { return phoneNumber; }

    @Override
    public String toString() {
        return "Passenger: " + fullName + ", Passport: " + passportNumber;
    }
}