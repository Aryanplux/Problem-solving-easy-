// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;


public class Solutions {
   public static void main(String args[]) {
       System.out.println("Enter x");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       System.out.println("Enter n");
       int n = sc.nextInt();


       int result = 1;
       for(int i=0; i<n; i++) {
           result = result * x;
       }


       System.out.println("x to the power n is : "+ result);
   }   
}
