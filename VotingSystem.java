import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] input = {"A","B","A","C","A","B","C","A","B","A"};

        for (String v : input) {
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }

        String winner = null;
        int max = 0;

        for (Map.Entry<String, Integer> e : votes.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }

        System.out.println(votes);
        System.out.println(winner);
    }
}