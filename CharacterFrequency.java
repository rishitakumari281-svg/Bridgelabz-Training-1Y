import java.util.Scanner;

public class CharacterFrequency {

    static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0)
                count++;
        }

        String[][] result = new String[count][2];
        int k = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] > 0) {
                result[k][0] = String.valueOf(ch);
                result[k][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                k++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[][] data = findFrequency(text);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }
}
