import java.awt.*;

public class Architect {

    public static void main(String[] args) {
        Bedroom room = new Bedroom(new Dimension(200, 100), 132, 2, Color.yellow, 2, 1, true, true);
        Bedroom room2 = new BedroomBuilder().setDimensions(new Dimension(300, 250)).createBedroom();
    }
}
