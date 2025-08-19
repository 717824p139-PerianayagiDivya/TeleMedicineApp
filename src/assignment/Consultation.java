package assignment;

public class Consultation {
    private String consultId;
    private Doctor doctor;
    private Patient patient;
    private String dateTime;
    private String notes;
    private String status; // Scheduled, Completed
    private Prescription prescription;

    public Consultation(String consultId, Doctor doctor, Patient patient, String dateTime) {
        this.consultId = consultId;
        this.doctor = doctor;
        this.patient = patient;
        this.dateTime = dateTime;
        this.notes = "";
        this.status = "Scheduled";
    }

    // Getters/Setters
    public String getConsultId() { return consultId; }
    public Doctor getDoctor() { return doctor; }
    public Patient getPatient() { return patient; }
    public String getDateTime() { return dateTime; }
    public String getNotes() { return notes; }
    public String getStatus() { return status; }
    public Prescription getPrescription() { return prescription; }

    // Methods
    public void startConsult(String notes) {
        this.status = "In Progress";
        this.notes = notes;
        System.out.println("Consultation started with notes: " + notes);
    }

    public void completeConsult() {
        this.status = "Completed";
        System.out.println("Consultation " + consultId + " completed.");
    }

    public void addDiagnosis(String diagnosis) {
        this.notes += "\nDiagnosis: " + diagnosis;
    }

    public void issuePrescription(Prescription p) {
        if (this.status.equals("Completed")) {
            this.prescription = p;
            System.out.println("Prescription issued for consultation " + consultId);
        } else {
            System.out.println("Cannot issue prescription until consult is completed.");
        }
    }


}
