// 17. Write a program to read 10 strings from console and then 
// print the sorted strings on console (Use String Class).
// 2) combine two string 3) reverse first string and display it.

import java.util.Scanner;
public class string_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        String arr1[]=new String[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter String: "+i);
            str=sc.next();
            arr1[i]=str;
            char arr[] = str.toCharArray();
            char temp;
            for(int a=0;a<arr.length;a++){
                for (int b=a+1;b<arr.length;b++){
                    if (arr[b] < arr[a]) {
                        temp = arr[a];
                        arr[a] = arr[b];
                        arr[b] = temp;
                    }
                }
            }
            System.out.println(arr);
        }
        System.out.println(arr1[0]+" "+arr1[1]);
        String nstr="";
        char ch;
        for (int i=0; i<arr1[0].length(); i++)
        {
            ch= arr1[0].charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed First String: "+ nstr);
 
    }
 
}
