import java.util.ArrayList;
import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 6, 5};
        System.out.println(peakElementIndex(arr));
    }
    public static int peakElementIndex(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] < arr[m - 1]) {
                r = m - 1;
            }
            else if (arr[m] < arr[m + 1]) {
                l = m + 1;
            }
            else {
                return m;
            }
        }
        return -1;
    }
}
