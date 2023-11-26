import java.util.Arrays;

public class task4 {
    static int counter = 0;

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Original array:" + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array:" + Arrays.toString(array));
        System.out.println("Number of actions:" + " " + counter);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            counter++;
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            counter++;
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
