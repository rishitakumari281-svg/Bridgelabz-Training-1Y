class Employee {

    int empId;
    String name;

    String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}