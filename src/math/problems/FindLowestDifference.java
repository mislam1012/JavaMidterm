package math.problems;

public class FindLowestDifference {

    static int findSmallestDifference(int A[], int B[],
                                      int m, int n)
    {
        // Sort both arrays
        // using sort function
        Arrays.sort(A);
        Arrays.sort(B);
     
        int a = 0, b = 0;
     
        // Initialize result as max value
        int result = Integer.MAX_VALUE;
     
        // Scan Both Arrays upto
        // sizeof of the Arrays
        while (a < m && b < n)
        {
            if (Math.abs(A[a] - B[b]) < result)
                result = Math.abs(A[a] - B[b]);
     
            // Move Smaller Value
            if (A[a] < B[b])
                a++;
     
            else
                b++;
        }
         
        // return final sma result
        return result;
    }

    public static void main(String[] args) {
        /*
         Write a method to return the the lowest difference between these two arrays
            HINT: The lowest difference between these arrays is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int m = array1.length;
        int n = array2.length;
     
        System.out.println(findSmallestDifference
                                   (array1, array2, m, n));

    }

}
