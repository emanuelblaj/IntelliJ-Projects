import java.sql.Struct;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        wrapper class = provides  way to use primitive data types as reference data types
//                        reference data types contain useful methods
//                        can be used with collections(ex. ArraysList

//        primitive     // wrapper
//        .........     //...........
//        boolean       // Boolean
//        char          //Character
//        int           //Integer
//        double        //Double

//        autoboxing  = the automatic conversion that the Java compiler makes between the primitive
//                      type and their corresponding object wrapper class
//        unboxig= the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Emanuel";

        if(b == '@') {
            System.out.println("This is true");
        }


/*
//        String =  a reference data type that can store one or more characters
//                  reference data types have access to useful methods

        String name = "Emanuel";

      */
/*  boolean result = name.equalsIgnoreCase("emanuel");*//*

//        int result = name.length();
//        char result = name.charAt(0);
//        int result = name.indexOf("m");
//        boolean result = name.isEmpty();
//        String result = name.toUpperCase();
//        String result = name.toLowerCase();
//        String result = name.trim();
//        String result = name.replace('e', 'a');

        System.out.println(result);
*/

////        Java arrays = used to store multiple values in a single variable
//
//        Scanner scanner = new Scanner(System.in);
//        String[] cars = new String[3];
//        System.out.println("Enter name of the cars: ");
//        cars[0] = scanner.next();
//        System.out.println("Enter name of the cars: ");
//        cars[1] = scanner.next();
//        System.out.println("Enter name of the cars: ");
//        cars[2] = scanner.next();
//
//        for(int i = 0; i < cars.length; i++) {
//            System.out.println("Name of the cars are for " + i + " : " + cars [i]);
//        }

        /*
         * Logical operators = used to connect two or more expressions
         *       ** && = (AND) both conditions must be true
         *       ** || = (OR) either condition must be true
         *       ** ! = (NOT) reverses boolean value of condition
         */
        /*Scanner scanner = new Scanner(System.in);*/
       /* System.out.print("You are playing a game! Press q or Q to quit ");
        String response = scanner.next();

       while (!(response.matches("Q"))|| !(response.matches("q"))) {
           if(response.equals("q") || response.equals("Q")) {
               System.out.println("Congratulation!You quit the game!");
               break;
           } else {
               System.out.println("You are still playying the game *pew pew*. Try another word.");
           }
           response = scanner.next();
       }*/
/*
//        Nested lops = a loop inside of a loop
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter symbol to use: ");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns;j++) {
                System.out.print(symbol);
            }
        }

       scanner.close();
    }*/
    }
}
