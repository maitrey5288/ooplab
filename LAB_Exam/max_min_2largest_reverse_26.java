import java.util.Arrays;

public class max_min_2largest_reverse_26 {
    
    public static void main(String[] args) {
        int array[]= {23, 92, 56, 39, 93};
        int max = 0;
 
        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        int min = array[0];
 
        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);

        // 2nd largest in an array
        Arrays.sort(array);
        System.out.println("Second largest element in array is:"+array[array.length-2]);

        // reverse an array of 10 input
        int arr[]={2,3,1,45,98,41,14,7,93,10};
        int arr_cpy[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr_cpy[i]=arr[arr.length-1-i];
        }
        for(int i=0;i<arr_cpy.length;i++){
            System.out.println(arr_cpy[i]);
        }
    }
 
}
