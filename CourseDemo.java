import java.util.*;

abstract class CourseType {}

class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {
    T type;

    Course(T type) {
        this.type = type;
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        Course<ExamCourse> c1 = new Course<>(new ExamCourse());
        Course<AssignmentCourse> c2 = new Course<>(new AssignmentCourse());

        System.out.println(c1);
        System.out.println(c2);
    }
}