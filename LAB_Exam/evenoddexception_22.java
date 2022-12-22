// 22.Write a program to handle the custom exception when the number
//  entered by user through keyboard is odd. Use throw and throws keywords. 
//  Exception name is OddNumberException. If the number is odd print message
//   "Number is Odd" else print "Number is Even".

import java.util.Scanner;
class OddNumberException extends Exception{
   @Override
   public String getMessage(){
       return "Number is Odd";
   }
}

public class evenoddexception_22 {
   public static void main(String[] args) throws OddNumberException{
       Scanner sc=new Scanner(System.in);
       OddNumberException oddNumberException = new OddNumberException();
       System.out.println("Enter a number");
       int a= sc.nextInt();
       if(a%2!=0){
           try {
               throw new OddNumberException();
           }
           catch (Exception e){
               System.out.println(oddNumberException.getMessage());
           }
       }
       else {
           System.out.println("Number is Even");
       }
   }
}
