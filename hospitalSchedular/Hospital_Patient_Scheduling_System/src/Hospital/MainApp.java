package Hospital;

//📌 MainApp.java
import java.util.*;

public class MainApp {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     HospitalScheduler scheduler = new HospitalScheduler();
     List<Doctor> doctors = new ArrayList<>();
     int patientId = 1;
     int doctorId = 1;
     int time = 1; // arrival order

     while (true) {
         System.out.println("\n===== Hospital Scheduler Menu =====");
         System.out.println("1. Add Doctor");
         System.out.println("2. Add Patient");
         System.out.println("3. Schedule Patients");
         System.out.println("4. View Assigned Patients");
         System.out.println("5. Exit");
         System.out.print("Enter choice: ");
         int choice = sc.nextInt();
         sc.nextLine();

         switch (choice) {
             case 1:
                 System.out.print("Enter Doctor Name: ");
                 String dName = sc.nextLine();
                 System.out.print("Enter Max Slots: ");
                 int slots = sc.nextInt();
                 Doctor doc = new Doctor(doctorId++, dName, slots);
                 doctors.add(doc);
                 System.out.println("✅ Doctor added: " + doc);
                 break;

             case 2:
                 System.out.print("Enter Patient Name: ");
                 String pName = sc.nextLine();
                 System.out.print("Enter Urgency (1 = Normal, 2 = Emergency): ");
                 int urgency = sc.nextInt();
                 Patient patient = new Patient(patientId++, pName, urgency, time++);
                 scheduler.addPatient(patient);
                 System.out.println("✅ Patient added: " + patient);
                 break;

             case 3:
                 scheduler.schedulePatients(doctors);
                 break;

             case 4:
                 System.out.println("\n--- Final Assignments ---");
                 for (Doctor d : doctors) {
                     System.out.println(d + " → " + d.getAssignedPatients());
                 }
                 break;

             case 5:
                 System.out.println("👋 Exiting... Thank you!");
                 sc.close();
                 return;

             default:
                 System.out.println("❌ Invalid choice, try again.");
         }
     }
 }
}