import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.9");
        BigDecimal b = new BigDecimal("0.7") ;
        BigDecimal x = a.subtract(new BigDecimal("0.1")) ;
       BigDecimal y = b.add(new BigDecimal("0.1"));

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(x.equals(y) );

    }
}
