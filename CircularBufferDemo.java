import java.util.*;

class CircularBuffer {
    int[] arr;
    int size, front, count;

    CircularBuffer(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        count = 0;
    }

    void add(int x) {
        int index = (front + count) % size;
        arr[index] = x;

        if (count == size) {
            front = (front + 1) % size;
        } else {
            count++;
        }
    }

    void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % size] + " ");
        }
        System.out.println();
    }
}

public class CircularBufferDemo {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);
        cb.display();
    }
}