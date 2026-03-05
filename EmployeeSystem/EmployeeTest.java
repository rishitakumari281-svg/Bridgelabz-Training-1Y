public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Rishi";

        Manager m1 = new Manager();
        m1.name = "Amit";
        m1.department = "Sales";

        System.out.println("Employee Email: " + e1.generateEmail());
        System.out.println("Manager Email: " + m1.generateEmail());
    }
}