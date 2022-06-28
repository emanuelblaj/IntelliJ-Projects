import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Java arrays = used to store multiple values in a single variable

        Scanner scanner = new Scanner(System.in);
        String[] cars = new String[3];
        System.out.println("Enter name of the cars: ");
        cars[0] = scanner.next();
        System.out.println("Enter name of the cars: ");
        cars[1] = scanner.next();
        System.out.println("Enter name of the cars: ");
        cars[2] = scanner.next();

        for(int i = 0; i < cars.length; i++) {
            System.out.println("Name of the cars are for " + i + " : " + cars [i]);
        }

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
