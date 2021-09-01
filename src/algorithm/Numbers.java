package algorithm;

import java.util.List;
import java.util.Random;

import databases.ConnectToSqlDB;

public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        int[] num = new int[1000000];
        storeRandomNumbers(num);

        // Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort took: "
                + selectionSortExecutionTime + " milliseconds");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);

        int n = num.length;
        randomize(num, n);

        // Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort took: "
                + insertionSortExecutionTime + " milliseconds");

        /*
         By following the same convention we used for Selection Sort, continue to do the same for all remaining sorting
            algorithms
         */

        //bubblesort
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort took: "
                + bubbleSortExecutionTime + " milliseconds");


        //quicksort
        algo.quickSort(num);
        long quickSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort took: "
                + quickSortExecutionTime + " milliseconds");

        //heapsort
        algo.heapSort(num);
        long heapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort took: "
                + heapSortExecutionTime + " milliseconds");


        //mergesort
        algo.mergeSort(num);
        long mergeSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort took: "
                + mergeSortExecutionTime + " milliseconds");

        //selectionsort
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort took: "
                + mergeSortExecutionTime + " milliseconds");

        //shellsort
        algo.countSort(num);
        long countSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort took: "
                + shellSortExecutionTime + " milliseconds");

        //bucketsort
        algo.bucketSort(num);
        long bucketSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort took: "
                + bucketSortExecutionTime + " milliseconds");

        /*
        Can you come to conclusion about which sorting algorithm is most efficient, given the size of the data set?
         */

         /**
answer:
bucket sort is most efficient given the size , they are O(n)

if we use comparison based sorting then best time complexity that we can achieve is O(nlogn).

there are several sorting algorithm such as Heap sort,quicksort and merge sort which has o(nlogn)time complexity.

Best case Average case Worst case

Quicksort Array O(n log(n))    O(n log(n))       O(n^2)

Mergesort Array O(n log(n))    O(n log(n))       O(n log(n))

Heapsort Array O(n log(n))     O(n log(n))       O(n log(n))

Quick sort is the fastest sorting algorithm.

shell sort has worst case of O(n^2)
Average	O(nlog n)

merge sort requires O(N) extra space. Allocating and de-allocating the extra space used for merge sort increases the running time of the algorithm.

Heapsort has O(N log N) , which is much better than worst case in Quicksort and aslo Heapsort don't need extra memory to perform sorting as it is required by Mergesort. 

Insertion sort, selection sort, and bubble sort has bad time complexity,
insertion sort best case is O(N) but average and worst case is O(N^2)
bubble sort , selection sort also has complexity of O(N^2)


         **/

    }




    /*
    HELPER METHODS
     */

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int[] arr, int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }
}
