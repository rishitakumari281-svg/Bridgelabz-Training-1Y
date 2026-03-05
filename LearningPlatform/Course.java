class Course {

    int courseId;
    String courseName;
    double price;

    static String platformName = "LearnHub";

    Course(int courseId, String courseName, double price) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.price = price;
    }

    double getFinalPrice() {
        return price;
    }

    String formatCourseName() {
        return courseName.substring(0,1).toUpperCase() + courseName.substring(1).toLowerCase();
    }
}