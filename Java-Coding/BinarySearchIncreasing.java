import java.util.Arrays;

public class BinarySearchIncreasing {
    public static void main(String[] args) {                            // Always use a sorted array for Binary Search
        int[] arr = {20, 44, 49, 58, 270};
        int len = arr.length, target = 20;
        System.out.println(Arrays.toString(binarySearch(arr, 5, target))); // Using .toString() method because printing arrays directly just gives out the memory location
    }

    public static int[] binarySearch(int[] arr, int len, int target) { // This function return the element and its index.
        int low = 0, high = len - 1;                          // This implementation was used from CodeWithHarry video

        while (low <= high) {
           int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return new int[] {target, mid};
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return new int[] {-1, -1};
    }
}
