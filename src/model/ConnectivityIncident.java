package model;

public class ConnectivityIncident extends Incident {
    private String affectedNetwork;

    public ConnectivityIncident(String id, String loc, String desc, String sev, Reporter rep, String affectedNetwork) {
        super(id, loc, desc, sev, rep);
        this.affectedNetwork = affectedNetwork;
    }

    @Override
    public int getTargetResolutionTime() {
        return getSeverity().equalsIgnoreCase("Critical") ? 2 : 6;
    }

    @Override
    public String getSummary() {
        return super.getSummary() + " | Type: Connectivity (" + affectedNetwork + ")";
    }
}
