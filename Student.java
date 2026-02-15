class Student {
    String name;
    int rollNumber;
    int marks;

    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 50) return 'C';
        else return 'D';
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rishi";
        s.rollNumber = 10;
        s.marks = 88;

        s.displayDetails();
    }
}
