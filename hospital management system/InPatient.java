import java.util.*;

class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    double calculateBill() {
        return daysAdmitted * dailyCharge;
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
