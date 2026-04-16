import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
}

public class TopMovies {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("A", 8.5, 2023));
        list.add(new Movie("B", 9.0, 2024));
        list.add(new Movie("C", 7.5, 2022));
        list.add(new Movie("D", 8.8, 2023));
        list.add(new Movie("E", 9.2, 2025));
        list.add(new Movie("F", 8.0, 2021));

        list.stream()
            .sorted((a, b) -> {
                if(b.rating == a.rating) return b.year - a.year;
                return Double.compare(b.rating, a.rating);
            })
            .limit(5)
            .forEach(m -> System.out.println(m.name + " " + m.rating));
    }
}