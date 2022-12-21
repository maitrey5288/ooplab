// 1.	Create arrayList, add the integer elements in arrayList using asList().Remove the duplicate values and return a 
// arrayList containing unique values. Implement the logic inside removeDuplicates() method. 
// Test the functionalities using the main () method of the Tester class. 
// Sample Input and Output---------10, 20, 10, 15,40,15,40   --- 10,20,15,40






import java.util.*;
class createarraylist_1{
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {
        ArrayList<T> newList = new ArrayList<T>();
        for (T element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 10, 15,40,15,40));
        System.out.println("ArrayList with duplicates: " + list);
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println("ArrayList with duplicates removed: " + newList);
    }
} 
