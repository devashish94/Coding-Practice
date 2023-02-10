import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4};
        System.out.println("Unsorted Array " + Arrays.toString(arr));
        System.out.print("Sorted Array " + Arrays.toString(bubbleSort(arr)));
    }
    public static int[] bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            System.out.println("Pass " + j);
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    System.out.println("i = " + i + " --> " + Arrays.toString(arr));
                }
            }
            System.out.println("-----------------------------");
        }
        return arr;
    }
}
