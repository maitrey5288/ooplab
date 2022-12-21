import java.util.*;
public class iterate_array_1 {
    // Java program to iterate over an ArrayList
// Using for loop

// Importing all utility classes

// Main class

	// Main driver method
	public static void main(String[] args)
	{
		// Creating and initializing the ArrayList
		// Declaring object of integer type
		List<Integer> numbers = Arrays.asList(1, 2, 3,
									4, 5, 6, 7, 8);
        System.out.print("for Loop: ");
		// Iterating using for loop
		for (int i = 0; i < numbers.size(); i++)
		{
			// Printing and display the elements in ArrayList
			System.out.print(numbers.get(i) + " ");	
        }

        Iterator i = numbers.iterator();
        System.out.print("\nIterator Loop: ");
        while (i.hasNext()) {
           System.out.print(i.next() + " ");
        }

	}

}
