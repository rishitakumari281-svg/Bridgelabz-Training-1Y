public class Main {
    public static void main(String[] args) {
        Integer[] scores = {10, null, 20, null, 30};

        int notPlayed = 0, sum = 0;

        for (Integer s : scores) {
            if (s == null) notPlayed++;
            else sum += s;
        }

        System.out.println(notPlayed);
        System.out.println(sum);
    }
}