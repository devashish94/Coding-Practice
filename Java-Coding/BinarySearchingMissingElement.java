public class BinarySearchingMissingElement {
    public static void main(String[] args) {
//        int[] arr = {1, 7, 16, 37, 43, 68, 73, 87, 91, 93};
        int[] arr = {1, 7, 16, 68, 73, 87, 91, 93};
        int target = 43;
        System.out.println("Closest element was: " + binarySearching(arr, target));
    }

    public static int binarySearching(int[] arr, int target) {
        int low = 0, high = arr.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low ) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return arr[mid];
    }
}
