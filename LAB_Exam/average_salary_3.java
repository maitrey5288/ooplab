// 3.Find and return the average salary, number of salaries greater than the average salary 
// and number of salaries lesser than the average salary from the salary array passed to
//  the findDetails() method. Method should return a double array containing
//   average salary in index position 0, number of salaries greater than the
//    average salary in index position 1 and number of salaries lesser than 
//    the average salary in index position 2. Implement the logic inside 
//    findDetails() method. Test the functionalities using the main method of the Tester class.                                                                                                                                                                                                                           sample Input: {23500.0 , 25080.0 , 28760.0 , 22340.0 , 19890.0}                                 
// output:       Average salary: 23914.0 
//     Number of salaries greater than the average salary: 2.0
//     Number of salaries lesser than the average salary: 3.0

import java.util.*;
public class average_salary_3 {
    

   static void findDetails() {
       int a = 23500;
       int b = 25080;
       int c = 28760;
       int d = 22340;
       int e = 19890;
       int sum = 0;
       int[] salary = {a, b, c, d,e};

       for (int i = 0; salary.length > i; i++) {
           sum=sum+salary[i];
           System.out.print(salary[i] + " ");
       }
       double average23 = sum / salary.length;
       System.out.println("Average salary: "+average23);
       List<Integer> highest = new ArrayList<Integer>();
       List<Integer> lowest = new ArrayList<Integer>();
       if(average23>a){
           lowest.add(a);
       }
       else{
           highest.add(a);
       }
       if(average23>b){
           lowest.add(b);
       }
       else {
           highest.add(b);
       }
       if(average23>c){
           lowest.add(c);
       }
       else {
           highest.add(c);
       }
       if(average23>d){
           lowest.add(d);
       }
       else{
           highest.add(d);
       }
       if(average23>e){
           lowest.add(e);
       }
       else{
           highest.add(e);
       }

       System.out.println("Number of salaries greater than average salary:"+highest.size());
       System.out.println("Number of salaries lower than average salary:"+lowest.size());
   }

   public static void main (String[]args){
       findDetails();
   }
}
