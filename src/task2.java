import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        int n = arr.length, counter = 0;

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            counter++;
            int minIndex = i;
            int maxIndex = i;

            for (int j = i + 1; j < arr.length - i; j++) {
                counter++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                } else if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int tempMin = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tempMin;

            if (maxIndex == i) {
                counter++;
                maxIndex = minIndex;
            }
            int tempMax = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[maxIndex];
            arr[maxIndex] = tempMax;
        }

        System.out.println("Sorted array:");
        System.out.println(counter);
        System.out.println(Arrays.toString(arr));
    }

    }


