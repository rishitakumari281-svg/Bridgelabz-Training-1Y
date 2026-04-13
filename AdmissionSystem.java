import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        return name.equals(((Student) o).name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name + " " + marks;
    }
}

class MeritStudent implements Comparable<MeritStudent> {
    String name;
    int marks;

    MeritStudent(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(MeritStudent s) {
        return s.marks - this.marks;
    }

    public String toString() {
        return name + " " + marks;
    }
}

public class AdmissionSystem {
    public static void main(String[] args) {
        List<Student> applicants = new ArrayList<>();
        Set<Student> shortlisted = new HashSet<>();
        Queue<Student> queue = new LinkedList<>();
        TreeSet<MeritStudent> merit = new TreeSet<>();

        applicants.add(new Student("A",80));
        applicants.add(new Student("B",90));
        applicants.add(new Student("A",80));

        shortlisted.addAll(applicants);

        queue.addAll(shortlisted);

        while (!queue.isEmpty()) {
            Student s = queue.remove();
            merit.add(new MeritStudent(s.name, s.marks));
        }

        System.out.println(merit);
    }
}