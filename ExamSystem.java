import java.util.*;

class Question {
    String text;

    Question(String text) {
        this.text = text;
    }

    public String toString() {
        return text;
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class ExamSystem {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        Set<String> studentIds = new HashSet<>();
        Queue<Student> queue = new LinkedList<>();
        Stack<Question> history = new Stack<>();

        questions.add(new Question("Q1"));
        questions.add(new Question("Q2"));
        questions.add(new Question("Q3"));

        Collections.shuffle(questions);

        studentIds.add("S1");
        studentIds.add("S2");
        studentIds.add("S1");

        queue.add(new Student("A"));
        queue.add(new Student("B"));

        while (!queue.isEmpty()) {
            Student s = queue.remove();
            System.out.println("Serving: " + s);

            for (Question q : questions) {
                history.push(q);
            }

            while (!history.isEmpty()) {
                System.out.println("Back: " + history.pop());
            }
        }
    }
}