package assignment;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends User {
    private String specialization;
    private String licenseNo;
    private List<String> availableSlots;
    private List<Consultation> consultations;

    public Doctor(String id, String name, String email, String specialization, String licenseNo) {
        super(id, name, email, "Doctor");
        this.specialization = specialization;
        this.licenseNo = licenseNo;
        this.availableSlots = new ArrayList<>();
        this.consultations = new ArrayList<>();
    }

    // Getters/Setters
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public String getLicenseNo() { return licenseNo; }
    public void setLicenseNo(String licenseNo) { this.licenseNo = licenseNo; }

    public List<String> getAvailableSlots() { return availableSlots; }

    public void addSlot(String slot) {
        availableSlots.add(slot);
    }

    // Method Overloading: bookSlot
    public boolean bookSlot(String exactSlot) {
        if (availableSlots.contains(exactSlot)) {
            availableSlots.remove(exactSlot);
            return true;
        }
        return false;
    }

    public boolean bookSlot(String day, String time) {
        String slot = day + " " + time;
        return bookSlot(slot);
    }

    // Override displayProfile
    @Override
    public void displayProfile() {
        System.out.println("Dr. " + name + " [" + specialization + "] - License: " + licenseNo);
    }

    // Methods
    public void addConsultation(Consultation c) {
        consultations.add(c);
    }

    public void viewSchedule() {
        System.out.println("Consultations for Dr. " + name + ":");
        for (Consultation c : consultations) {
            System.out.println(" - " + c.getConsultId() + " with " + c.getPatient().getName() + " at " + c.getDateTime());
        }
    }

    public void cancelSlot(String slot) {
        if (!availableSlots.contains(slot)) {
            availableSlots.add(slot);
            System.out.println("Slot " + slot + " reopened.");
        }
    }
}


