public class FootballHeights {

    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // 150–250
        }
        return heights;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double)findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr)
            min = Math.min(min, h);
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr)
            max = Math.max(max, h);
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();

        System.out.println("Heights:");
        for (int h : heights)
            System.out.print(h + " ");

        System.out.println("\nMean: " + findMean(heights));
        System.out.println("Shortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
    }
}
