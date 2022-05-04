import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.IntPredicate;
import java.util.stream.Stream;


public class Algorithms  {


    public static void main(String[] args) {

        CustomLinkedList linkedList = new CustomLinkedList();

        Node firstNode = new Node(3);
        Node  secondNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        linkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        linkedList.displayContents();
        linkedList.deleteBackHalf();
        linkedList.displayContents();


 }
}