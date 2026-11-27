package model;

public class Technician extends User {
    private String specialty;

    public Technician(String userId, String name, String specialty) {
        super(userId, name);
        this.specialty = specialty;
    }

    public String getSpecialty() { return specialty; }

    @Override
    public String getRole() { return "Technician"; }
}
