import java.io.File;
import java.io.IOException;

public class FileCreatorExample {

    public static void main(String[] args) {

        File myFile = new File("C:\\Users\\emanu\\OneDrive\\Desktop\\myFile.txt");
       try {
          boolean fileCreated =  myFile.createNewFile();
           System.out.println(fileCreated);
       } catch (IOException ioe) {


       }

    }
}
