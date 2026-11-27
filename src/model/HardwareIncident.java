package model;

public class HardwareIncident extends Incident {
    private String deviceName;

    public HardwareIncident(String id, String loc, String desc, String sev, Reporter rep, String deviceName) {
        super(id, loc, desc, sev, rep);
        this.deviceName = deviceName;
    }

    @Override
    public int getTargetResolutionTime() {
        return getSeverity().equalsIgnoreCase("Critical") ? 4 : 12;
    }

    @Override
    public String getSummary() {
        return super.getSummary() + " | Type: Hardware (" + deviceName + ")";
    }
}
