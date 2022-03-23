public class TestCircle {

    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(1.2);
        Circle c3 = new Circle();
        c3.setRadius(5.0);
        c3.setColor("white");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c2);
        System.out.println("Operator ' + ' invokes toString() too: " + c2);

    }
}
