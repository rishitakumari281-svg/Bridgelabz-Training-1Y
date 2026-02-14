public class NumberChecker {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String str = String.valueOf(n);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++)
            digits[i] = str.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, power);
        return sum == n;
    }

    public static int[] largestTwo(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int d : arr) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        return new int[]{largest, second};
    }

    public static int[] smallestTwo(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int d : arr) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }
        return new int[]{smallest, second};
    }
}
