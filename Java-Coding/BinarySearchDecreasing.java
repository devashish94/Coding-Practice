import java.util.Arrays;

public class BinarySearchDecreasing {
    public static void main(String[] args) {
        int[] arr = {20, 19, 18, 15, 11, 9, 3};
        int len = arr.length;
        int target = 19;
        System.out.println(BinarySearch(arr, 7, target));
    }

    public static int BinarySearch(int[] arr, int len, int target) {
        int start = 0, end = len - 1;
        while (start <= end) {
            int mid = start + (end - end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
