import java.util.Scanner;

public class CharacterTypeTable {

    static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] analyzeString(String text) {
        String[][] data = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            data[i][0] = String.valueOf(text.charAt(i));
            data[i][1] = checkChar(text.charAt(i));
        }

        return data;
    }

    static void displayTable(String[][] data) {
        System.out.println("Character\tType");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] result = analyzeString(text);
        displayTable(result);
    }
}
