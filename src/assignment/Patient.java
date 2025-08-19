package assignment;

import java.util.ArrayList;
import java.util.List;

public class Patient extends User {
    private int age;
    private String gender;
    private List<Consultation> consultHistory;

    public Patient(String id, String name, String email, int age, String gender) {
        super(id, name, email, "Patient");
        this.age = age;
        this.gender = gender;
        this.consultHistory = new ArrayList<>();
    }

    // Getters/Setters
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    // Override displayProfile
    @Override
    public void displayProfile() {
        System.out.println("Patient: " + name + " (" + age + ", " + gender + ")");
    }

    // Methods
    public void addConsultation(Consultation c) {
        consultHistory.add(c);
    }

    public void viewPrescriptionHistory() {
        System.out.println("Prescription history for " + name + ":");
        for (Consultation c : consultHistory) {
            if (c.getPrescription() != null) {
                c.getPrescription().displayPrescription();
            }
        }
    }

    public void requestConsultation(Doctor doctor, String slot) {
        if (doctor.bookSlot(slot)) {
            System.out.println(name + " booked slot: " + slot + " with Dr. " + doctor.getName());
        } else {
            System.out.println("Slot unavailable for Dr. " + doctor.getName());
        }
    }
}


