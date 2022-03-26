public class PrintSpooler {

    private static final PrintSpooler spooler = new PrintSpooler();;
    private static boolean initialized = false;
    private PrintSpooler() {

    }

    private void init() {
//        Code to initializa our print spooler goes here
    }

    public static synchronized PrintSpooler getInstance() {
        if(initialized) {
            return spooler;
        }
        spooler.init();;
        initialized = true;
        return spooler;
    }



}
