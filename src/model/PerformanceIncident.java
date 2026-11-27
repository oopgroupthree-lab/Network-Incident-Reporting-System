package model;

public class PerformanceIncident extends Incident {
    private int latencyMs;

    public PerformanceIncident(String id, String loc, String desc, String sev, Reporter rep, int latencyMs) {
        super(id, loc, desc, sev, rep);
        this.latencyMs = latencyMs;
    }

    @Override
    public int getTargetResolutionTime() {
        return getSeverity().equalsIgnoreCase("Critical") ? 3 : 8;
    }

    @Override
    public String getSummary() {
        return super.getSummary() + " | Type: Performance (" + latencyMs + "ms latency)";
    }
}
