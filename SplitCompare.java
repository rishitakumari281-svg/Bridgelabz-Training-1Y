import java.util.Scanner;

public class SplitCompare {

    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    static String[] splitUsingCharAt(String text) {
        int len = findLength(text);
        int words = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        int[] spaceIndex = new int[words + 1];
        int k = 1;
        spaceIndex[0] = -1;
        spaceIndex[words] = len;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[k++] = i;
            }
        }

        String[] result = new String[words];

        for (int i = 0; i < words; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            result[i] = word;
        }

        return result;
    }

    static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length)
            return false;

        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] userSplit = splitUsingCharAt(text);
        String[] builtInSplit = text.split(" ");

        boolean result = compareArrays(userSplit, builtInSplit);

        System.out.println(result);
    }
}
