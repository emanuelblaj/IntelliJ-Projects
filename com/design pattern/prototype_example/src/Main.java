public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setOwner("Sally");
        Rabbit rabbitCopy = rabbit.clone();
        System.out.println("Name of first rabbit:" + rabbit.getOwner().getName());
        System.out.println("Name of second rabbit: " + rabbitCopy.getOwner().getName());

        rabbitCopy.getOwner().setName("Steve");
        System.out.println(rabbit.getOwner().getName());
        System.out.println(rabbitCopy.getOwner().getName());
    }
}
