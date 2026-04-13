import java.util.*;

public class ReverseListDemo {
    public static <T> void reverseList(List<T> list) {
        int left = 0, right = list.size() - 1;

        while (left < right) {
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> linkList = new LinkedList<>(arrList);

        reverseList(arrList);
        reverseList(linkList);

        System.out.println(arrList);
        System.out.println(linkList);
    }
}