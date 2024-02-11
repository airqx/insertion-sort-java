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

    public static void main(String[] args) {
        // Test the selection sort method
        int[] testArray = {6804, 34, 555, 12, 22, 11, 93};
        selectionSort(testArray);
        for (int i : testArray) {
            System.out.print(i + " ");
        }
    }

        // New sort method that calls selection sort
        public static void sort(int[] array) {
            selectionSort(array);
        }
    }

