class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println(teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println(programmingLanguage);
    }
}

class Intern extends Employee {
    String duration;

    Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println(duration);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Alice", 1, 80000, 5),
            new Developer("Bob", 2, 60000, "Java"),
            new Intern("Charlie", 3, 20000, "6 months")
        };

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
