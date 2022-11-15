import java.util.Random;
import java.util.Scanner;

/*
    Write  a complete program that searches in an array X for all the elements that  are
*   multiple of 7 or multiple of 3. X is of type integer, and size 100. The subscripts of the target
*   elements are to be stored in another array y of the same size. The array x is filled by the
*   user .. The array Y is initialzed to -1.
*
* */
public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int rand1 = 0 ;
//        Scanner sc = new Scanner(System.in);
        int[] x = new int[100];
        int[] y = new int[100];

        for(int counter = 1; counter <=100; counter++) {
            rand1 = rand.nextInt(100);
            System.out.println(rand1+ " ");
        }

        for(int i = 0; i < 100; i++) {
//            x[i] = sc.nextInt();
            x[i] = rand1;
            y[i] = -1;
        }
        int j = 0;
        for (int i = 0; i < y.length;i++) {
            if ((x[i] % 7 == 0) || (x[i] % 3 == 0)) {
                y[j++] = i;
            }
        }
        for (int i = 0; i < y.length;i++) {
            if(y[i] != -1){
                System.out.println("Result: " + y[i]);
            }

        }
    }
}
