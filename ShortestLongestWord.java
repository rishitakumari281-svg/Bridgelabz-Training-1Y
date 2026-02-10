import java.util.Scanner;

public class ShortestLongestWord {

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

        int[] index = new int[words + 1];
        index[0] = -1;
        index[words] = len;

        int k = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ')
                index[k++] = i;
        }

        String[] result = new String[words];

        for (int i = 0; i < words; i++) {
            String word = "";
            for (int j = index[i] + 1; j < index[i + 1]; j++) {
                word = word + text.charAt(j);
            }
            result[i] = word;
        }

        return result;
    }

    static String[][] create2DArray(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    static int[] findShortestAndLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitUsingCharAt(text);
        String[][] data = create2DArray(words);
        int[] result = findShortestAndLongest(data);

        System.out.println("Shortest Word: " + data[result[0]][0]);
        System.out.println("Longest Word: " + data[result[1]][0]);
    }
}
