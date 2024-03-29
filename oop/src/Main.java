public class Main {
    public static void main(String[] args) {
        /*  interface = a template that can be applied to a class.
        *               similar to inheritance, but specifies what a class has/must do.
        *               classes can apply more than one iterface, inheritance is limited to 1 super*/

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        System.out.println();
        hawk.hunt();
        System.out.println();

        fish.hunt();
        System.out.println();
        fish.flee();
    }
}
