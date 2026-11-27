import model.*;

public class Main {
    public static void main(String[] args) {
        Reporter rep = new Reporter("U01", "Ababiya");
        Technician tech = new Technician("T01", "Samuel", "Network Security");

        Incident[] incidents = {
            new ConnectivityIncident("INC-001", "Lab 3", "Wi-Fi completely down", "Critical", rep, "Campus-WiFi"),
            new HardwareIncident("INC-002", "Server Room", "Router overheating", "High", rep, "Cisco-R1"),
            new PerformanceIncident("INC-003", "Library", "Slow internet speeds", "Medium", rep, 450),
            new SecurityIncident("INC-004", "Admin Block", "Unauthorized login attempts", "Critical", rep, "Brute Force")
        };

        incidents[0].assignTechnician(tech);
        incidents[3].assignTechnician(tech);
        incidents[3].updateStatus("Resolved");

        System.out.println("=== NETWORK INCIDENT REPORT ===");
        for (Incident inc : incidents) {
            System.out.println(inc.getSummary() + " | Target SLA: " + inc.getTargetResolutionTime() + "h");
        }
    }
}
