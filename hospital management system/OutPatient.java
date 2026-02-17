import java.util.*;

class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        records.add(record);
    }

    public void viewRecords() {
        for (String r : records) {
            System.out.println(r);
        }
    }
}
