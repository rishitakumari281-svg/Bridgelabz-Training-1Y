import java.util.Scanner;

public class SubstringCompare {

    static String substringUsingCharAt(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result = result + s.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String charAtSub = substringUsingCharAt(text, start, end);
        String builtInSub = text.substring(start, end);

        boolean result = compareStrings(charAtSub, builtInSub);

        System.out.println(charAtSub);
        System.out.println(builtInSub);
        System.out.println(result);
    }
}
