# 🏥 Hospital Patient Scheduling System

## 📌 Project Overview

Hospitals face challenges in efficiently scheduling patients to doctors. Patients arrive with **different urgency levels**, while doctors have **limited appointment slots**.
This system ensures:

* Emergency patients are prioritized.
* Waiting times are minimized.
* Doctors' schedules are optimized.

This project demonstrates the use of **Data Structures (DSA)** and **Design & Analysis of Algorithms (DAA)** concepts in a real-world healthcare scenario.

---

## 🎯 Features

* Patient registration with details (name, age, urgency level).
* Priority scheduling using **Priority Queue / Heap** (patients with higher urgency are seen first).
* Efficient doctor slot allocation using **Greedy Algorithm (DAA)**.
* Waiting list display in real-time.
* User-friendly CLI (Console Interface).

---

## 🛠️ Tech Stack

* **Language:** Java
* **IDE:** Eclipse 
* **Concepts:**

  * Priority Queue (DSA)
  * Graph/Heap Scheduling (DSA)
  * Greedy Algorithm for slot assignment (DAA)

---

## 📂 Project Structure

```
HospitalScheduler/
│── src/
│   ├── Patient.java          # Patient class with attributes
│   ├── Doctor.java           # Doctor class with available slots
│   ├── Scheduler.java        # Scheduling logic (Priority Queue + Greedy)
│   └── Main.java             # Entry point (user menu & CLI)
│
│── README.md                 # Project documentation
```

---
      
## 📖 Example Execution

```
===== Hospital Scheduler Menu =====
1. Add Doctor
2. Add Patient
3. Schedule Patients
4. View Assigned Patients
5. Exit
Enter choice: 1
Enter Doctor Name: Prathmesh Navale
Enter Max Slots: 1
✅ Doctor added: Doctor 1 (Prathmesh Navale)
```

---

## 📊 DSA & DAA Topics Covered

* **Priority Queue / Heap** → Manage patients based on urgency.
* **HashMap** → Track doctors and slots.
* **Greedy Algorithm** → Assign patients to available doctors optimally.

---

## 🌟 Future Enhancements

* Add GUI using **JavaFX/Swing**.
* Connect to a **database (MySQL/PostgreSQL)** for persistent storage.
* Integrate machine learning for **predictive scheduling**.

---

## 👨‍💻 Author

**Prathmesh Navale**


---


