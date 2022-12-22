
import java.util.*;
 class Armstrong {
	/* Function to calculate x raised to the
	power y */
	int power(int x, long y)
	{
		if (y == 0)
			return 1;
		if (y % 2 == 0)
			return power(x, y / 2) * power(x, y / 2);
		return x * power(x, y / 2) * power(x, y / 2);
	}
    
	/* Function to calculate order of the number */
	int order(int x)
	{
		int n = 0;
		while (x != 0) {
			n++;
			x = x / 10;
		}
		return n;
	}

	// Function to check whether the given number is
	// Armstrong number or not
	boolean isArmstrong(int x)
	{
		// Calling order function
		int n = order(x);
		int temp = x, sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + power(r, n);
			temp = temp / 10;
		}

		// If satisfies Armstrong condition
		return (sum == x);
	}
}
    public class palindrome_4 {
	// Driver Program
	public static void main(String[] args)
	{
        //a. code for armstrong 
		Armstrong ob = new Armstrong();
        Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		System.out.println("is armstrong number: "+ob.isArmstrong(x));
		x = reader.nextInt();
		System.out.println("is armstrong number: "+ ob.isArmstrong(x));
       


        //b. palindrome
        
        int r,sum=0,temp;    
        
        int n=reader.nextInt();//It is the number variable to be checked for palindrome  
        
        temp=n;    
        while(n>0){    
        r=n%10;  //getting remainder  
        sum=(sum*10)+r;    
        n=n/10;    
        }    
        if(temp==sum)    
        System.out.println("palindrome number ");    
        else    
        System.out.println("not palindrome");    

        //c. Check that given number is odd or even    
       
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        
        if(num%2 == 0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
        
        
        //  d.	Print reverse of a number
     

        int number =reader.nextInt();
       
        int reverse = 0;  
        while(number != 0)   
        {  
        int remainder = number % 10;  
        reverse = reverse * 10 + remainder;  
        number = number/10;  
        }  
        System.out.println("The reverse of the given number is: " + reverse);  
        reader.close();
}  

	}



