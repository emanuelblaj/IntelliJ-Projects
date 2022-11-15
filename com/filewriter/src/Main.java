import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses Are red\nViolets are blue \n Booty booty booty \n Rockin' everywhere");
            writer.append("\n(A poem by Emanuel)");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
