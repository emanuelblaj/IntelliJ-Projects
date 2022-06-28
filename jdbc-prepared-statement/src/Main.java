import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        String lastName;

        ArrayList<String> arrayList  = new ArrayList<>();
        arrayList.add("Ionut");
        arrayList.add("Cristi");
        arrayList.add("Andrri");
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList);


        // Enter username and press Enter
        System.out.println("Enter username: ");
        userName = myObj.nextLine();

        System.out.println("Username is: " + userName);


        System.out.print("Enter last name: ");
        lastName = myObj.nextLine();
        System.out.println("Last name is: " + lastName);
        myObj.close();

        myObj.close();



    }
}
