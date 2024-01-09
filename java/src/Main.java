import java.util.Arrays;

public class Main{

    public static void main(String[] args) {

        int[] array = {10, 8, 6, 12, 13, 3, 15, 4, 11, 7}; // Initializes an array with unsorted elements.
        System.out.println("Original Array: " + Arrays.toString(array));

        quicksort(array, 0, array.length - 1);  // Calls the quicksort function to sort the array.

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    // Helper function to find the median of three elements
    private static int findMedian(int[] arr, int low, int mid, int high) {
        int[] tempArray = {arr[low], arr[mid], arr[high]}; // A temporary array is created with the three values.
        Arrays.sort(tempArray); // The temporary array is sorted in ascending order.
        return tempArray[1];
        //  The median is the middle element of the sorted array (index 1 since arrays are zero-indexed)
        // However, it's not always guaranteed to be at index 1.
        //The reason it works in this case is because tempArray is of size 3, and when sorted, the middle element will be at index 1.
        // If the array size were different, such as 5, the middle element after sorting would be at index 2.
        //For a more general approach, you can always calculate the index of the middle element as (tempArray.length - 1) / 2
    }

    // Partition function with modified pivot selection
    private static int partition(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2; //  Calculates the middle index of the current sub-array.
        int pivot = findMedian(arr, low, mid, high);
        // Calls the findMedian function to get the median of the first, middle, and last elements.
        // i and j are Pointers for the left and right parts of the array.
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // The while loop continues until the pointers meet.
            //The two inner do-while loops move i to the right until an element greater than or equal to the pivot is found,
            // and j to the left until an element less than or equal to the pivot is found.
            //After finding such elements, they are swapped.

        }
    }

    // Quicksort function
    private static void quicksort(int[] arr, int low, int high) {
        if (low < high) { // the if loop checks if low is less than high to determine if the array or sub-array has more than one element.
            int partitionIndex = partition(arr, low, high); // Calls the partition function to find the partition index.

            // Recursively sort the two halves
            quicksort(arr, low, partitionIndex); // makes a recursive call to quicksort on the left half of the array (from low to partitionIndex).
            quicksort(arr, partitionIndex + 1, high); // makes another recursive call to quicksort on the right half of the array (from partitionIndex + 1 to high).


        }
    }
}
