package _27197.staff;

public class CabinCrew extends Staff {

    private String languageSkills;

    public CabinCrew(String staffId, String name, double salary, String languageSkills) {
        super(staffId, name, "Cabin Crew", salary);
        this.languageSkills = languageSkills;
    }

    @Override
    public String toString() {
        return super.toString() + ", Languages: " + languageSkills;
    }
}