
public class Customer {

    private boolean haveBeenServed;
    private String name;

    public Customer(String name) {
        haveBeenServed = false;
        this.name = name;
    }

        public void serve() {
            haveBeenServed = true;
            System.out.println(name + " has been seved");
        }

    @Override
    public String toString() {
        return name;
    }
}
