import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Main class
public class GFG {
//    Main driver method
    public static void main(String[] args) {

//        Creating an empty ArrayList of Student type
        ArrayList <Student> ar = new ArrayList<Student>();

//        Adding entries in above List using add() method
        ar.add(new Student(111, "Mayank", "London"));
        ar.add(new Student(131, "Anshul", "NYC"));
        ar.add(new Student(121, "Solank", "Jaipur"));
        ar.add(new Student(101, "Aggarwl", "HongKong"));

//        Display message on console for beter readability
        System.out.println("Unsorted");

//        Itterating over entrie to print them
        for(int i  = 0 ; i < ar.size();i++) {
            System.out.println(ar.get(i));
        }

//        Sorting student entries by roll number
        Collections.sort(ar, new SortByRoll());

//        Display message on console for better readability
        System.out.println("\nSorted by rollno");

//        Again iterating over on entries to print them
        for(int i = 0; i < ar.size();i++) {
            System.out.println(ar.get(i));
        }

//        Sorting student entries by name
        Collections.sort(ar, new SortByName());

//        Display message on console for better readability
        System.out.println("\nSorted by name");

//        Again iterating over entrie to print them
        for(int i = 0; i < ar.size();i++) {
            System.out.println(ar.get(i));
        }
    }
}
