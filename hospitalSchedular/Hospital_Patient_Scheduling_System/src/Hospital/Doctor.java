package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private int id;
    private String name;
    private int maxSlots;
    private List<Patient> assignedPatients;

    public Doctor(int id, String name, int maxSlots) {
        this.id = id;
        this.name = name;
        this.maxSlots = maxSlots;
        this.assignedPatients = new ArrayList<>();
    }

    public boolean hasAvailableSlot() {
        return assignedPatients.size() < maxSlots;
    }

    public void assignPatient(Patient patient) {
        if (hasAvailableSlot()) {
            assignedPatients.add(patient);
        }
    }

    public List<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    @Override
    public String toString() {
        return "Doctor " + id + " (" + name + ")";
    }
}