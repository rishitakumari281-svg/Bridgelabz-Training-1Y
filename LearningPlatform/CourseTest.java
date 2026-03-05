public class CourseTest {

    public static void main(String[] args) {

        Course c1 = new RecordedCourse(101, "java", 1000);
        Course c2 = new LiveCourse(102, "python", 2000);

        System.out.println("Platform: " + Course.platformName);

        System.out.println("Course: " + c1.formatCourseName());
        System.out.println("Final Price: " + c1.getFinalPrice());

        System.out.println("Course: " + c2.formatCourseName());
        System.out.println("Final Price: " + c2.getFinalPrice());
    }
}