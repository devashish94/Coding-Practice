public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(peak(arr));
    }
    public static int peak(int[] arr) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid  == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid]  > arr[mid + 1])) {
                return arr[mid];
            }
            else if (arr[mid] <= arr[mid + 1]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
