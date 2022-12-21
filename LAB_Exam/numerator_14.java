// 14.Write a program that reads from the user four integers representing 
// the numerators and denominators of two fractions calculates the results
//  of the two fractions and displays the values of the fractions sum, 
//  subtraction, multiplication and division. Display output up to two decimal places.
import java.util.Scanner;
public class numerator_14 {

   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n1= sc.nextInt();
       int d1= sc.nextInt();
       int n2= sc.nextInt();
       int d2= sc.nextInt();
       float a=n1*d2;
       float b=n2*d1;
       float c=d1*d2;
       float d=n1*n2;
       float e=d1*d2;
       float sum=(a+b)/c;
       float diff=(a-b)/c;
       float multi=d/e;
       float div=a/b;
       System.out.println("The sum is: "+sum);
       System.out.println("The diff is: "+diff);
       System.out.println("The multiplication is: "+multi);
       System.out.println("The division is: "+div);
   }
}



