import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Stream;


public class Algorithms  {

    public static void main(String[] args) {

        Node rootNode = new Node();
        rootNode.data = 5;
        Node nodeTwo = new Node();
        nodeTwo.data = 2;
        Node nodeFour = new Node();
        nodeFour.data = 4;
        Node nodeNine = new Node();
        nodeNine.data = 9;
        Node nodeTen = new Node();
        nodeTen.data = 10;
        Node nodeSeven = new Node();
        nodeSeven.data = 7;

        rootNode.left = nodeTwo;
        rootNode.right = nodeFour;
        nodeTwo.left = nodeNine;
        nodeTwo.right = nodeTen;
        nodeFour.left = nodeSeven;

        BinaryTree tree = new BinaryTree();
        tree.root = rootNode;

        System.out.print("Pre Order Traversal: " );
        tree.preOrderTraversal();
        System.out.println();

        System.out.print("In Order Traversal: ");
        tree.inOrderTraversal();
        System.out.println();

        System.out.print("Post Order Traversal: ");
        tree.postOrderTraversal();
        System.out.println();
 }
}