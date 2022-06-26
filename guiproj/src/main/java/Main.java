import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null,"You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(in cm)"));
        JOptionPane.showMessageDialog(null,"You are " + height + " cm tall");*/


        /*Calculate hypothenuse at a triangle*/
        double x, y, z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

       z =  Math.sqrt((x * x) + (y * y));
        System.out.println("Hypotenuse is : " + z);
        scanner.close();

    }
}
