
/*18. Write a Java program to multiply two binary numbers.
*
*Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110  */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      /*  WorkingMultiply workingMultiply = new WorkingMultiply();
        System.out.println(workingMultiply.multiplyBinary("11101", "1001"));*/

//        OR

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        String s1 = scanner.next();
        System.out.println("Input the second numbe: ");
       String s2 = scanner.next();

        System.out.println("Product of two binary numbers: " +
                Integer.toBinaryString((Integer.parseInt(s1, 2) * (Integer.parseInt(s2, 2)))));


    }

}
