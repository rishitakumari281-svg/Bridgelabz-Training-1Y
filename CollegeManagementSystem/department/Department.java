package college.department;

public class Department {

    private int deptId;
    private String deptName;

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void displayDepartment() {
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
        System.out.println("---------------------");
    }
}