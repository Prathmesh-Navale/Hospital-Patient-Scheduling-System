package Hospital;

//📌 Patient.java
public class Patient implements Comparable<Patient> {
 private int id;
 private String name;
 private int urgency; // 1 = Normal, 2 = Emergency
 private int arrivalTime;

 public Patient(int id, String name, int urgency, int arrivalTime) {
     this.id = id;
     this.name = name;
     this.urgency = urgency;
     this.arrivalTime = arrivalTime;
 }

 public int getId() { return id; }
 public String getName() { return name; }
 public int getUrgency() { return urgency; }
 public int getArrivalTime() { return arrivalTime; }

 @Override
 public int compareTo(Patient other) {
     // Emergency first, then earlier arrival
     if (this.urgency != other.urgency) {
         return Integer.compare(other.urgency, this.urgency);
     } else {
         return Integer.compare(this.arrivalTime, other.arrivalTime);
     }
 }

 @Override
 public String toString() {
     return "Patient " + id + " (" + name + ", " +
             (urgency == 2 ? "Emergency" : "Normal") + ")";
 }
}