package math.problems;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */
     
     // reursive method to find factorial of given number
    static int factorial(int n)
    {
        if (n == 0)
            return 1;
  
        return n * factorial(n - 1);
    }

     // iterative Method to find factorial of the given number
    static int ifactorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }



    public static void main(String[] args) {
        System.out.println("Factorial recursion");
        System.out.println("Factorial of " + 5
                           + " is " + factorial(5));
        System.out.println("Factorial of " + 6
                           + " is " + factorial(6));
        System.out.println("Factorial of " + 7
                           + " is " + factorial(7));

        System.out.println("Factorial iterative");
        System.out.println("Factorial of " + 5
                           + " is " + ifactorial(5));
        System.out.println("Factorial of " + 6
                           + " is " + ifactorial(6));
        System.out.println("Factorial of " + 7
                           + " is " + ifactorial(7));


    }
}
