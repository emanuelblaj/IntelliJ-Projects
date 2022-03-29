import java.util.ArrayList;

public class ChocolateFactory extends Candy{

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList();
        for (int i = 1; i <= quantity;i++) {
            ChocolateFactory chocolate = new ChocolateFactory();
            chocolatePackage.add(chocolate);
        }

        System.out.println("One package of " + quantity + " chocolates has been made!");
        return chocolatePackage;
     }
}
