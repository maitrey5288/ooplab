import java.util.Scanner;

public class nextprime_9 {

    static boolean isPrime(int n) {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    // Function to return the smallest
    // prime number greater than N
    static int nextPrime(int N) {

        // Base case
        if (N <= 1)
            return 2;

        int prime = N;
        boolean found = false;

        // Loop continuously until isPrime returns
        // true for a number greater than n
        while (!found) {
            prime++;

            if (isPrime(prime))
                found = true;
        }

        return prime;
    }

    // Driver code
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        // reading the number of elements from the that we want to enter
        n = sc.nextInt();
        // creates an array in the memory of length 10
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            // reading array elements from the user
            array[i] = sc.nextInt();
        }
        // accessing array elements using the for loop
        for (int i = 0; i < n; i++) {
            array[i] = nextPrime(array[i]);
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        
        
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(args[2]);
            boolean res = (a % b == 0 || b % a == 0);
            if (res){
            System.out.println(res);
            }

    }
}
