import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

//    Exception = an event that occurs during the execution of a program that,
//                    disrupts the normal flow of instructions

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);
       try {

           System.out.println("Enter a whole number to divide: ");
           int x = scanner.nextInt();

           System.out.println("Enter a whole number to divide by:  ");
           int y = scanner.nextInt();

           int z = x /y;

           System.out.println("result: " + z);


       }
       catch (ArithmeticException ex) {
           System.out.println("You can't divide by zero! IDIOT!");
       }
       catch (InputMismatchException e) {
           System.out.println("PLEASE ENTER A NUMBER OFMG!!!");

       }
       catch (Exception ex) {
           System.out.println("Something went wrong!");
       }
       finally {
           scanner.close();
       }
    }
}
