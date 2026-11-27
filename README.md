# Network Incident Reporting System

> **Log outages, classify incidents, and track resolution.**

**Course:** CS2010 — Object-Oriented Programming  
**Institution:** Shaggar Institute of Technology  
**Group:** Group 3  

---

## Overview
Network outages are often reported informally through calls and chats, causing lost tickets, duplicate reports, and slow recovery times. The **Network Incident Reporting System** is a Java application designed for IT departments to log outages, classify them by type and severity, assign technicians, and track each incident from report to closure.

---

## Core Features
- **User Roles:** Reporter, Technician, and Administrator.
- **Incident Logging:** Record location/device, description, severity, reporter, and unique ID.
- **Classification:** Categorize incidents into Connectivity, Hardware, Performance, and Security with severity-based target resolution times.
- **Lifecycle Tracking:** Assign technicians and track status transitions (`Open` -> `In Progress` -> `Resolved` -> `Closed`).
- **Planned Additions:** Overdue detection, search & filtering, summary reports, file persistence, custom exception handling, and a Java Swing/JavaFX GUI.

---

## OOP Architecture
This project is built incrementally around core Object-Oriented Programming principles:
- **Encapsulation:** Private fields with controlled getters and mutators across all model classes.
- **Inheritance:** Abstract `Incident` base class extended by `ConnectivityIncident`, `HardwareIncident`, `PerformanceIncident`, and `SecurityIncident`; abstract `User` extended by `Reporter`, `Technician`, and `Administrator`.
- **Polymorphism:** Incident subclasses override `getTargetResolutionTime()` and `getSummary()`.
- **Abstraction:** `Trackable` and `Reportable` interfaces define shared contracts.

---

## Project Structure
```text
src/
├── Main.java          # Entry point & Phase 1 OOP demonstration
├── model/             # User & Incident hierarchies, interfaces
├── service/           # Business logic & rules (upcoming)
├── storage/           # File I/O persistence (upcoming)
├── gui/               # Desktop interface (upcoming)
├── util/              # Helper utilities (upcoming)
└── exceptions/        # Custom exception classes (upcoming)
```

---

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/oopgroupthree-lab/Network-Incident-Reporting-System.git
   cd Network-Incident-Reporting-System
   ```
2. Compile the source files:
   ```bash
   javac src/model/*.java src/Main.java -d out
   ```
3. Run the application:
   ```bash
   java -cp out Main
   ```

---

## Team — Group 3
| Member | Role |
| :--- | :--- |
| **Ababiya Bayessa Erena** | Team Leader — Coordination & Integration |
| **Tulu Wario** | Repository Management |
| **Ayantu Asfaw Lami** | Model Classes & Class Hierarchy |
| **Miheret Tamiru Gebremedhin** | Service Layer & Business Rules |
| **Milkeso Gemeda** | GUI Design & Implementation |
| **Samuel Dereje Nadew** | File Storage, Reports & Testing |
