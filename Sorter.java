public class Sorter {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j; //searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    // New sort method that calls selection sort
    public static void sort(int[] array) {
        selectionSort(array);
    }

    public static void printArray(int[] testArray) {
        // Test the selection sort method
        for (int i : testArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}