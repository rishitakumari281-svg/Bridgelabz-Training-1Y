class Manager extends Employee {

    String department;

    String generateEmail() {
        return name.toLowerCase() + "." + department.toLowerCase() + "@company.com";
    }
}