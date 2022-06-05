public class Main {
    public static void main(String[] args) {
        int[] t1 = {5, 3, 2, 5, 7, 0, 1};
        int[] t2 = {-2, -1, -3, 4, 8, 0};
        int[] t3 = {-20, -10, 3, 9, -8};

        MaxProductInterpreter max = new MaxProductInterpreter();

        System.out.println("Max product1: ");
        System.out.println(max.maximumProduct(t1));
        System.out.println(max.maximumProduct(t2));
        System.out.println(max.maximumProduct(t3));

        System.out.println();
        System.out.println("Max product2:");

        System.out.println(max.maximumProduct2(t1));
        System.out.println(max.maximumProduct2(t2));
        System.out.println(max.maximumProduct2(t3));

        System.out.println();
        System.out.println("Max product3:");
        System.out.println(max.maximumProduct3(t1));
        System.out.println(max.maximumProduct3(t2));
        System.out.println(max.maximumProduct3(t3));


    }

}
