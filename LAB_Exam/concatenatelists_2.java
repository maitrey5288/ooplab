// Given two lists, concatenate the second list in reverse order to the end of the first list and return the concatenated list. Implement the logic inside concatenateLists() method.   
// listOne = Hello   102  200.8  25           
//  listTwo = 150  40.8   welcome   A     
// output:   Hello   102  200.8   25  A  welcome   40.8   150  







import java.util.*;
public class concatenatelists_2 {
    static void concentrateList(){
        List<String>list1=new ArrayList<String>();
        list1.add("Hello");
        list1.add("102");
        list1.add("200.8");
        list1.add("25");
        System.out.println("listone:"+list1);
        List<String>list2=new ArrayList<String>();
        list2.add("150");
        list2.add("40.8");
        list2.add("welcome");
        list2.add("A");
        System.out.println("listtwo:"+list2);
        Collections.reverse(list2);
        System.out.println("Reverse listtwo"+list2);
        List<String> joinedlist= new ArrayList<String>();
        joinedlist.addAll(list1);
        joinedlist.addAll(list2);
        System.out.println("Reverse list is:"+joinedlist);
 
    }
    public static void main(String[]args){
        concentrateList();
    }
 }
 
  

