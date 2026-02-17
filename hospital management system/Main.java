import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient("P1", "Rishi", 20, 5, 2000);
        OutPatient p2 = new OutPatient("P2", "Aman", 25, 500);

        p1.addRecord("Admitted for surgery");
        p2.addRecord("Regular checkup");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());

            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }

            System.out.println("-------------------");
        }
    }
}
