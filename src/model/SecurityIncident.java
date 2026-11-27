package model;

public class SecurityIncident extends Incident {
    private String threatType;

    public SecurityIncident(String id, String loc, String desc, String sev, Reporter rep, String threatType) {
        super(id, loc, desc, sev, rep);
        this.threatType = threatType;
    }

    @Override
    public int getTargetResolutionTime() {
        return 1; // Security is always top priority
    }

    @Override
    public String getSummary() {
        return super.getSummary() + " | Type: Security (" + threatType + ")";
    }
}
