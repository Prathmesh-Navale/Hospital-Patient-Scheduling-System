package Hospital;

//📌 HospitalScheduler.java
import java.util.List;
import java.util.PriorityQueue;

public class HospitalScheduler {
    private PriorityQueue<Patient> patientQueue;

    public HospitalScheduler() {
        patientQueue = new PriorityQueue<>();
    }

    public void addPatient(Patient patient) {
        patientQueue.add(patient);
    }

    public void schedulePatients(List<Doctor> doctors) {
        System.out.println("\n--- Scheduling Patients ---");
        for (Doctor doctor : doctors) {
            while (doctor.hasAvailableSlot() && !patientQueue.isEmpty()) {
                Patient next = patientQueue.poll();
                doctor.assignPatient(next);
                System.out.println(doctor + " → " + next);
            }
        }
        System.out.println("--- Scheduling Complete ---\n");
    }
}