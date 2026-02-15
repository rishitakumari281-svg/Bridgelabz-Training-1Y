class Employee1 {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double s) {
        salary = s;
    }
}

class Manager extends Employee1 {
    void display() {
        System.out.println(employeeID);
        System.out.println(department);
    }
}
