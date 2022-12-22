// 12.	a) Write a program to check if the two strings 
// entered by user are anagrams or not. Two words are said to be anagrams if
//  the letters of one word can be rearranged to form
//   the other word. For example, jaxa and ajax are anagrams of each other.
import java.util.Arrays;
public class anagrams_12 {
    


   public static void main(String[] args) {
       String str1 = "Race";
       String str2 = "Care";

       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();

       if(str1.length() == str2.length()) {

           // convert strings to char array
           char[] charArray1 = str1.toCharArray();
           char[] charArray2 = str2.toCharArray();

           Arrays.sort(charArray1);
           Arrays.sort(charArray2);
           boolean result = Arrays.equals(charArray1, charArray2);

           if(result) {
               System.out.println(str1 + " and " + str2 + " are anagram.");
           }
           else {
               System.out.println(str1 + " and " + str2 + " are not anagram.");
           }
       }
       else {
           System.out.println(str1 + " and " + str2 + " are not anagram.");
       }
   
}
}

