public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 6, 3, 9};

        System.out.print("Original array: ");
        InsertionSort.printArray(array);

        InsertionSort.sort(array);
        System.out.print("Sorted array: ");
        InsertionSort.printArray(array);

        int[] testArray = {6804, 34, 555, 12, 22, 11, 93};

        System.out.print("Before sort: ");
        Sorter.printArray(testArray);

        Sorter.sort(testArray) ;
        System.out.print("After sort: ");
        Sorter.printArray(testArray);
    }
}
