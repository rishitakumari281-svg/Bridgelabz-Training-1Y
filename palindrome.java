public static int[] reverse(int[] arr) {
    int[] rev = new int[arr.length];
    for (int i = 0; i < arr.length; i++)
        rev[i] = arr[arr.length - 1 - i];
    return rev;
}

public static boolean areEqual(int[] a, int[] b) {
    if (a.length != b.length) return false;
    for (int i = 0; i < a.length; i++)
        if (a[i] != b[i]) return false;
    return true;
}

public static boolean isPalindrome(int[] digits) {
    return areEqual(digits, reverse(digits));
}
