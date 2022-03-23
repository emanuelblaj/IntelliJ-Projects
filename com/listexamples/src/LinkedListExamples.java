import java.util.LinkedList;

public class LinkedListExamples {

    public static void main(String[] args) {

        LinkedList<String> myList = new LinkedList<>();
        myList.add("A");
        myList.add("B");
        myList.add(1,"C");

        System.out.println(myList);

        myList.remove(2);
        System.out.println(myList);

    }
}
