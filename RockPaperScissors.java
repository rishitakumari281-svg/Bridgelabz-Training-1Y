import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp))
            return "Draw";

        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("rock") && comp.equals("paper")) return "Computer";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        if (user.equals("paper") && comp.equals("scissors")) return "Computer";
        if (user.equals("scissors") && comp.equals("paper")) return "User";
        if (user.equals("scissors") && comp.equals("rock")) return "Computer";

        return "Invalid";
    }

    static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf(compPercent);

        return stats;
    }

    static void displayResults(String[][] games, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println();
        System.out.println("Player\tWins\tWinPercentage");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int games = sc.nextInt();
        sc.nextLine();

        String[][] gameResult = new String[games][3];
        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.nextLine().toLowerCase();
            String comp = computerChoice();
            String winner = findWinner(user, comp);

            gameResult[i][0] = user;
            gameResult[i][1] = comp;
            gameResult[i][2] = winner;

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) compWins++;
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayResults(gameResult, stats);
    }
}
