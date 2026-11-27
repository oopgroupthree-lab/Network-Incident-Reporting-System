package model;

public class Reporter extends User {
    public Reporter(String userId, String name) {
        super(userId, name);
    }

    @Override
    public String getRole() { return "Reporter"; }
}
