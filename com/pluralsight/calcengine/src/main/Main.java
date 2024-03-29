package main;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d,225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];


        // with for and switch statement
        if(args.length == 0) {
            for (int i = 0; i < opCodes.length; i++) {
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
           /* switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                default:
                    System.out.println("Invalid opCode: " + opCodes[i]);
                    results[i] = 0.0d;
            }*/
            }

            for (double currentResult : results) {
                System.out.println(currentResult);
            }
        }else if(args.length == 1 && args[0].equals("interactive") ) {
            executeInteractively();
        }
        else if(args.length == 3) {
            handleCommandLine(args);
        } else {
            System.out.println("Please provide an operation code and 2 numeric values.");
        }


        /// with if-else statement
          /*  if (opCode == 'a')
                result = val1 + val2;
            else if (opCode == 's')
                result = val1 - val2;
            else if (opCode == 'm')
                result = val1 * val2;
            else if (opCode == 'd') {
                if (val2 != 0)
                    result = val1 / val2;
            } else {
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;

        }
        System.out.println(result);*/
    }

    private static void executeInteractively() {
        System.out.println("Enter an operation and two numbers: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        if(opCode == 'w')
            handleWhen(parts);
        else {
            double leftVal = valueFromWord(parts[1]);
            double rightVal = valueFromWord(parts[2]);
            double result = execute(opCode, leftVal, rightVal);

            displayResult(opCode, leftVal, rightVal, result);
        }
    }

    private static void handleWhen(String[] parts) {
        LocalDate startDate = LocalDate.parse(parts[1]);
        long daysToAdd = (long) valueFromWord(parts[2]);
       LocalDate newDate =  startDate.plusDays(daysToAdd);
       String output = String.format("%s plus %d days is %s", startDate, daysToAdd, newDate);
        System.out.println(output);

    }

    private static void displayResult(char opCode, double leftVal, double rightVal, double result) {
        char symbol = symbolFromOpCore(opCode);
        /*StringBuilder builder = new StringBuilder(20);
        builder.append(leftVal);
        builder.append(" ");
        builder.append(symbol);
        builder.append(" ");
        builder.append(rightVal);
        builder.append(" = ");
        builder.append(result);
        String output = builder.toString();
        System.out.println(output); */

        String output = String.format("%.3f %c %.3f = %.3f", leftVal,symbol , rightVal, result);
        System.out.println(output);
    }


    private static char symbolFromOpCore(char opCode) {
        char[] opCodes = {'a', 's', 'm', 'd'};
        char[] symbols = {'+', '-', '*', '/' };
        char symbol = ' ';
        for (int index = 0; index < opCodes.length;index++) {
            if(opCode == opCodes[index]) {
                symbol = symbols[index];
                break;
            }
        }
        return symbol;
    }



    private static void handleCommandLine(String[] args) {
        char opCode =args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double righVal = Double.parseDouble(args[2]);
        double result = execute(opCode, leftVal, righVal);

        System.out.println(result);



    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
       switch (opCode) {
           case 'a':
               result = leftVal + rightVal;
               break;
           case 's':
               result = leftVal - rightVal;
               break;
           case 'm':
               result = leftVal * rightVal;
               break;
           case 'd':
               result = rightVal != 0 ? leftVal / rightVal : 0.0d;
               break;
           default:
               System.out.println("Invalid opCode: " + opCode);
               result = 0.0d;
               break;
       }
       return result;
    }

    private static char opCodeFromString(String operationName) {
        char opCode = operationName.charAt(0);
        return opCode;
    }

    private static double valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        double value = -1d;
        for(int index = 0; index < numberWords.length;index++) {
            if(word.equals(numberWords[index])){
                value = index;
                break;
            }
        }
        if(value == -1d)
           value = Double.parseDouble(word);

        return value;
    }
}
