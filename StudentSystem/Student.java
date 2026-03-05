class Student {

    int rollNo;
    String name;
    int marks;

    String calculateGrade() {

        if (marks >= 80) {
            return "A";
        } 
        else if (marks >= 60) {
            return "B";
        } 
        else {
            return "C";
        }
    }
}