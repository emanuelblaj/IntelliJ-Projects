import java.util.ArrayList;

public class HardCandy_Peppermint extends Candy{
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList();
        for (int i = 1; i <= quantity; i++) {
            HardCandy_Peppermint hardCandy_peppermint = new HardCandy_Peppermint();
            hardCandyPackage.add(hardCandy_peppermint);
        }

        System.out.println("One package of " + quantity + " hard candy has been made!");
        return hardCandyPackage;
    }
}
