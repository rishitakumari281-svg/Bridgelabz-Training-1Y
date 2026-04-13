import java.util.*;

class Book {
    String name;

    Book(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> queue = new LinkedList<>();
        Stack<Book> returned = new Stack<>();

        books.add(new Book("Java"));
        books.add(new Book("DSA"));

        members.add("M1");
        members.add("M2");

        queue.addAll(books);

        while (!queue.isEmpty()) {
            Book b = queue.remove();
            returned.push(b);
        }

        if (!returned.isEmpty()) {
            Book b = returned.pop();
            queue.add(b);
        }

        System.out.println(queue);
    }
}