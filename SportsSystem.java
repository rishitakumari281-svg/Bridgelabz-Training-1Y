import java.util.*;

class Team implements Comparable<Team> {
    String name;
    int points;

    Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public int compareTo(Team t) {
        return t.points - this.points;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        return name.equals(((Team) o).name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    public String toString() {
        return name + " " + points;
    }
}

class Match {
    String info;

    Match(String info) {
        this.info = info;
    }

    public String toString() {
        return info;
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

public class SportsSystem {
    public static void main(String[] args) {
        Set<Team> teams = new HashSet<>();
        Queue<Match> matches = new LinkedList<>();
        List<Result> results = new ArrayList<>();
        TreeSet<Team> ranking = new TreeSet<>();

        Team t1 = new Team("A",10);
        Team t2 = new Team("B",5);

        teams.add(t1);
        teams.add(t2);

        matches.add(new Match("A vs B"));

        while (!matches.isEmpty()) {
            Match m = matches.remove();
            results.add(new Result(m.toString()));
            ranking.add(t1);
            ranking.add(t2);
        }

        System.out.println(results);
        System.out.println(ranking);
    }
}