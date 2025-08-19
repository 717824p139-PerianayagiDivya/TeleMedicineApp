package assignment;

public class Prescription {
    private String rxId;
    private Consultation consultation;
    private String medicines;
    private String dosage;
    private String validity;

    public Prescription(String rxId, Consultation consultation, String medicines, String dosage, String validity) {
        this.rxId = rxId;
        this.consultation = consultation;
        this.medicines = medicines;
        this.dosage = dosage;
        this.validity = validity;
    }

    // Getters/Setters
    public String getRxId() { return rxId; }
    public String getMedicines() { return medicines; }
    public void setMedicines(String medicines) { this.medicines = medicines; }

    public String getDosage() { return dosage; }
    public void setDosage(String dosage) { this.dosage = dosage; }

    public String getValidity() { return validity; }
    public void setValidity(String validity) { this.validity = validity; }

    // Methods
    public void displayPrescription() {
        System.out.println("Prescription ID: " + rxId);
        System.out.println("Medicines: " + medicines + ", Dosage: " + dosage + ", Valid till: " + validity);
    }

    public void extendValidity(String newDate) {
        this.validity = newDate;
        System.out.println("Validity extended till " + newDate);
    }

    public void updateMedicines(String newMedicines) {
        this.medicines = newMedicines;
        System.out.println("Medicines updated: " + newMedicines);
    }
}


