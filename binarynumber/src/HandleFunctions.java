import java.util.LinkedList;
import java.util.Queue;

public class HandleFunctions {

    /*Solution with built-in function*/
    public void printBinary(int n) {
        System.out.println("For value : " + n);
        if (n <= 0) {

            System.out.println("Nothing to print\n");
            return;
        }

        for (int i = 1; i <= n;i++) {
            System.out.println(Integer.toBinaryString(i));
        }

        System.out.println();
    }

    /*Solution without built-in function with Queue*/
    public void printBinaryUsingQueue(int n) {
        System.out.println("For value : " + n);
        if(n <= 0) {
            System.out.println("Nothing to print\n");
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        for (int i = 1;  i <= n;i++) {
            Integer current = queue.remove();
            System.out.println(current);

            queue.add(current * 10);
            queue.add(current * 10 + 1);
        }
        System.out.println();


    }
}
