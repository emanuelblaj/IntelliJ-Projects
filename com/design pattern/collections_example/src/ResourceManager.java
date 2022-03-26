import java.util.Collections;
import java.util.List;

public class ResourceManager {

    public ResourceManager() {

    }

    public static void main(String[] args) {
        PrintSpooler spooler = new PrintSpooler();

        List<PrintSpooler> spoolers = Collections.singletonList(spooler);
        preocessResources(spoolers);

        PrintSpooler spooler2 = new PrintSpooler();
        spoolers.add(spooler2);
    }

    public static<Type> void preocessResources(List<Type> list) {
        for (Type p : list) {

        }
    }
}
