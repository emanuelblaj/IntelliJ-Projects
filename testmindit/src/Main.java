import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

       Thread thread = new Thread(()-> System.out.println("Hello from Another thread"));
       thread.start();


      /*  int [] A = {1, -2, 4, 0 , -5, 5};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < A.length;i++)  {
            if(A[i] > 0)  {
                sum += A[i];
                System.out.println("A[i] =  " + i + ", Value = " + A[i] +  ", Sum =  "+ sum);;
                if(count == 3) {
                    System.out.println(sum) ;
                }
            }

        }*/
//        int[] A = {100, 100, 100, -10};
        /*int[] A = {180, -50, -25, -25};

//        String[] D = {"2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"};
        String[] D= {"2020-01-01", "2020-01-01", "2020-01-01", "2020-12-31"};

        int[] payment = new int[12]; //total card payments per month
        int[] transfer = new int[12]; // total incoming transfer per month
        int[] count = new int[12];  //number of payments per month

        for (int i = 0; i < 12; i++) {
            payment[i] = 0;
            transfer[i] = 0;
            count[i] = 0;
        }

        for (int i = 0; i < A.length; i++) {
            String[] date = D[i].split("-", 3);
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            if (year == 2020) {
                if (A[i] < 0) {
                    payment[month - 1] -= A[i];
                    count[month - 1]++;
                } else {
                    transfer[month - 1] += A[i];
                }
            }
        }
//        Empty account at the beginning of the year
        int balance = 0;

        for (int k = 0; k < 12; k++) {
            balance += transfer[k] - payment[k];
            if (count[k] < 3 || payment[k] < 100) { //if 3 payments of < 100 total cost
                balance -= 5;
                // fee deduction
            }
        }

        System.out.println(balance);*/
/*
       ArrayList val = new ArrayList();
       val.add("s1");
       val.add("s2");
       val.add("s3");
       val.add("s4");

        String s4 = "s5";

       if(val.contains(s4)) {
           System.out.println(true);
       } else {
           System.out.println(false);
       }*/

        }

    }

