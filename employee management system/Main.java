import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee e1 = new FullTimeEmployee(1, "Rishi", 50000);
        e1.assignDepartment("HR");

        PartTimeEmployee e2 = new PartTimeEmployee(2, "Aman", 500, 20);
        e2.assignDepartment("IT");

        employees.add(e1);
        employees.add(e2);

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
