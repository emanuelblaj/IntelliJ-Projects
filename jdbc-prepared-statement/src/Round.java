import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;


public class Round {

    private static final double PI = 3.1415D;

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(
                    "Key: " + entry.getKey() +
                            " - " +
                            "Value: " + entry.getValue());
        }

    }
    public static double round(double value, int places) {
        if(places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static double roundNotPrecise(double value, int places) {
        if(places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static double rountAvoid(double value, int places ) {
        double scale = Math.pow(10, places);
        double rounded = Math.round(value * scale) / scale;
        return rounded;
    }
}
