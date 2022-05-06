import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.IntPredicate;
import java.util.stream.Stream;


public class Algorithms  {

    public static void printBinary(int n) {
        if(n <= 0) {
            System.out.println();
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for (int i = 0; i < n; i++) {
            int current = queue.remove();
            System.out.println(current);

            queue.add(current * 10);
            queue.add(current * 10 + 1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printBinary(3);
        printBinary(-5);
        printBinary(0);
        printBinary(2);
        printBinary(9);


 }
}