class Student1 {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double c) {
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student1 {
    void display() {
        System.out.println(rollNumber);
        System.out.println(name);
    }
}
