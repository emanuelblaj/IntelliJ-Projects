import java.util.ArrayList;

public class ChocolateFactory extends CandyFactory{

    @Override
    public Candy getCandy(String section) {

            switch (section) {
                case "dark":
                    return new Chocolate_dark();
                case "milk":
                    return new Chocolate_milk();
                case "white":
                    return new Chocolate_white();
                default:
                    return new Chocolate_milk();
            }
    }
}
