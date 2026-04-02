public class Main {
    public static boolean isValid(String age) {
        try {
            int a = Integer.parseInt(age);
            return a >= 18;
        } catch (Exception e) {
            return false;
        }
    }
}