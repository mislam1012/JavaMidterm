package math.problems;

public class Pattern {

    public static void main(String[] args) {
        /*
        Read the numbers below, find the pattern, then implement the logic from this pattern.
            Once done, you should test to see if you get the same output as below:

        100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32...

        */

/*
This Java program allows the user to enter any integer value (the maximum limit value). 
we need to print all the natural numbers from maximum limit value to 1 in reverse.
*/

                int number=100, i;	
		
		for(i = number; i >= 1; i--)
		{
			System.out.print(i +","); 
		}	

    }
}
