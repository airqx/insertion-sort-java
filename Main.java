import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void Main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 6, 3, 9};

        System.out.print("Original array: ");
        printArray(array);
// creating sort function to call the insertionSort function
        sort(array);

        System.out.print("Sorted array: ");
        printArray(array);
    }
    public static void sort(int[] array) {
        insertionSort(array);
        } 
// insertionSort for array 
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
// Shift elements of arr[0..i-1] that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
// Insert the key element into its correct position in the sorted part of the array
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
