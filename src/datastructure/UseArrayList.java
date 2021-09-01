package datastructure;
import java.io.*;
import java.util.*;

public class UseArrayList {

        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */


// Java program to demonstrate the
// working of ArrayList in Java



	public static void main(String[] args)
	{
		// Size of the
		// ArrayList
		int n = 5;

		// Declaring the ArrayList with
		// initial size n
		ArrayList<Integer> arrli
			= new ArrayList<Integer>(n);

		// Appending new elements at
		// the end of the list
		for (int i = 1; i <= n; i++)
			arrli.add(i);

		// Printing elements
		System.out.println(arrli);

		// Remove element at index 3
		arrli.remove(3);

		// Displaying the ArrayList
		// after deletion
		System.out.println(arrli);

		// Printing elements one by one
		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
}

}
