import java.util.Arrays;

public class BubbleSortTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{5, 3}, {5, 2}, {5, 4}, {4, 4}, {6, 1}};
        System.out.println("Unsorted Array " + Arrays.deepToString(arr));
        System.out.print("Sorted Array " + Arrays.deepToString(bubbleSortTwoD(arr)));
    }
    public static int[][] bubbleSortTwoD(int[][] arr) {
        int[] temp;
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Pass " + i);
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("j = " + j + " --> " + Arrays.deepToString(arr));
                }
                else if (arr[j][0] == arr[j + 1][0] && arr[j][1] > arr[j + 1][1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("j = " + j + " --> " + Arrays.deepToString(arr));
                }
            }
            System.out.println("-----------------------------");
        }
        return arr;
    }
}
