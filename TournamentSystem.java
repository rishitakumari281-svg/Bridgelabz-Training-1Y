import java.util.*;

class Player {
    String name;

    Player(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        return name.equals(((Player) o).name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name;
    }
}

class Match {
    String match;

    Match(String match) {
        this.match = match;
    }

    public String toString() {
        return match;
    }
}

class Result {
    String result;

    Result(String result) {
        this.result = result;
    }

    public String toString() {
        return result;
    }
}

class Score implements Comparable<Score> {
    String name;
    int points;

    Score(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public int compareTo(Score s) {
        return s.points - this.points;
    }

    public String toString() {
        return name + " " + points;
    }
}

public class TournamentSystem {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        Queue<Match> matches = new LinkedList<>();
        List<Result> results = new ArrayList<>();
        TreeSet<Score> scores = new TreeSet<>();

        players.add(new Player("A"));
        players.add(new Player("B"));

        matches.add(new Match("A vs B"));

        while (!matches.isEmpty()) {
            Match m = matches.remove();
            results.add(new Result(m.toString()));
            scores.add(new Score("A",10));
            scores.add(new Score("B",5));
        }

        System.out.println(results);
        System.out.println(scores);
    }
}