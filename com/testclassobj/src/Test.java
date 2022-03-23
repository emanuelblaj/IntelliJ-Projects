/*A Java program to demonstrate working of a class type object created by
* JVM to represent .class file in memory*/

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;

public class Test {

//    Java code to demonstrate use of Class Object created by JVM
    public static void main (String[] args) {

//        Demnstrate class loadr

        /*String class is loaded by bootstrap loader, and bootstrap loader is not Java
        * object, hence null*/
        System.out.println(String.class.getClassLoader());
//       Test class is loaded by Application loader
        System.out.println(Test.class.getClassLoader());

       /* Student s1 = new Student();

//        Getting hold of Class object created by JVM.
        Class c1 = s1.getClass() ;

//        Printing type of object using c1.
        System.out.println(c1.getName());

//        getting all methods in an array.
        Method m[] = c1.getDeclaredMethods();
        for (Method method : m) {
            System.out.println(method.getName());
        }
//         Getting all fileds in an array.
        Field f[] = c1.getDeclaredFields();
        for (Field field : f) {
            System.out.println(field.getName());
        }

    */


    }

}
