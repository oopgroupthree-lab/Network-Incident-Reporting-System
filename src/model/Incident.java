package model;

public abstract class Incident implements Trackable, Reportable {
    private String incidentId;
    private String location;
    private String description;
    private String severity;
    private String status;
    private Reporter reporter;
    private Technician assignedTech;

    public Incident(String incidentId, String location, String description, String severity, Reporter reporter) {
        this.incidentId = incidentId;
        this.location = location;
        this.description = description;
        this.severity = severity;
        this.reporter = reporter;
        this.status = "Open";
    }

    public String getIncidentId() { return incidentId; }
    public String getLocation() { return location; }
    public String getDescription() { return description; }
    public String getSeverity() { return severity; }
    public Reporter getReporter() { return reporter; }
    public Technician getAssignedTech() { return assignedTech; }

    public void assignTechnician(Technician tech) {
        this.assignedTech = tech;
        this.status = "In Progress";
    }

    @Override
    public String getStatus() { return status; }

    @Override
    public void updateStatus(String newStatus) { this.status = newStatus; }

    public abstract int getTargetResolutionTime(); // in hours

    @Override
    public String getSummary() {
        String techName = (assignedTech != null) ? assignedTech.getName() : "Unassigned";
        return "[" + incidentId + "] " + severity + " | " + location + " | Status: " + status + " | Tech: " + techName;
    }
}
