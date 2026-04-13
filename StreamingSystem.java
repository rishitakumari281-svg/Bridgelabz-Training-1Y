import java.util.*;

class Movie {
    String name;
    String genre;

    Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String toString() {
        return name;
    }
}

public class StreamingSystem {
    public static void main(String[] args) {
        Stack<Movie> history = new Stack<>();
        List<Movie> all = new ArrayList<>();
        Set<String> genres = new HashSet<>();
        Queue<Movie> next = new LinkedList<>();

        Movie m1 = new Movie("A","Action");
        Movie m2 = new Movie("B","Drama");

        all.add(m1);
        all.add(m2);

        next.add(m1);
        next.add(m2);

        while (!next.isEmpty()) {
            Movie m = next.remove();
            history.push(m);
            genres.add(m.genre);
        }

        System.out.println(history);
        System.out.println(genres);
    }
}