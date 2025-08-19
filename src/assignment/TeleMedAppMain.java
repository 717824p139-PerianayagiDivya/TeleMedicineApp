package assignment;

public class TeleMedAppMain {
    public static void main(String[] args) {
        // Create Doctor and Patient
        Doctor doc1 = new Doctor("D139", "Kishore", "kishore@med.com", "Cardiology", "LIC1234");
        doc1.addSlot("2025-09-12 10:00");
        doc1.addSlot("2025-09-12 11:00");

        Patient pat1 = new Patient("P301", "Gowtham", "gowtham@mail.com", 20, "Male");

        // Display Profiles
        doc1.displayProfile();
        pat1.displayProfile();

        // Book a Consultation
        pat1.requestConsultation(doc1, "2025-09-12 10:00");
        Consultation consult1 = new Consultation("C001", doc1, pat1, "2025-09-12 10:00");
        doc1.addConsultation(consult1);
        pat1.addConsultation(consult1);

        // Start and Complete Consult
        consult1.startConsult("Patient has chest pain.");
        consult1.addDiagnosis("Possible Angina");
        consult1.completeConsult();

        // Issue Prescription
        Prescription rx1 = new Prescription("RX101", consult1, "Aspirin", "75mg daily", "2025-10-12");
        consult1.issuePrescription(rx1);

        // Follow-up and Display
        doc1.viewSchedule();
        pat1.viewPrescriptionHistory();
    }
}
