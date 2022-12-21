public class subarr_with_sum_27 {

    static void count_elem(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        if (count==0){
            System.out.println(-1);
        }
        if(count!=0){
            System.out.println(count);
        }
    }

    static void subArraySum(int arr[], int n, int sum) {

        // Pick a starting point
        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];

            if (currentSum == sum) {
                System.out.println("Sum found at indexe "  + i);
                return;
            } else {
                // Try all subarrays starting with 'i'
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];

                    if (currentSum == sum) {
                        System.out.println("Sum found between indexes " + i  + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
        return;
    }


    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        subArraySum(arr, n, sum);
        int arr1[] = {1, 1, 2, 2, 2, 2, 3,};
        count_elem(arr1, 4);

    }
}
