public class Main {

    /*Create a program that print binary number for a given number*/
    public static void main(String[] args) {
        HandleFunctions handleFunctions = new HandleFunctions();

        System.out.println("Solution with built-in function:");
        handleFunctions.printBinary(0);
        handleFunctions.printBinary(3);
        handleFunctions.printBinary(1);
        handleFunctions.printBinary(-1);
        handleFunctions.printBinary(-9);
        handleFunctions.printBinary(14);


        System.out.println("Solution without built-in function:");
        handleFunctions.printBinaryUsingQueue(0);
        handleFunctions.printBinaryUsingQueue(3);
        handleFunctions.printBinaryUsingQueue(1);
        handleFunctions.printBinaryUsingQueue(-1);
        handleFunctions.printBinaryUsingQueue(-9);
        handleFunctions.printBinaryUsingQueue(14);
    }
}
