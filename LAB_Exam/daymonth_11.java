// 11 . b) Write a program that takes two int values m and d from
//  the command line and prints true if day d of month m is
//   between 3/20 and 6/20, false otherwise.

import java.util.Scanner;
public class daymonth_11 {

   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int m = sc.nextInt();
       int d = sc.nextInt();
       boolean res = (((m==3)&&(d>20&&d<=31))||((m==4)&&(d>=1&&d<=30))||((m==5)&&(d>=1&&d<=31))||((m==6)&&(d>=1&&d<20)));
       System.out.println("Result=" + res);
   }
}


