// Write a Function for An order agnostic Binary Search

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {20, 19, 18, 15, 11, 9, 3}; //For Decreasing order
        int[] arr = {3, 9, 20, 44, 49, 58, 270, };      //For Increasing order
        int len = arr.length;
        int target = 9;
        System.out.println(orderAgnosticBinarySearch(arr, 7, target));
    }

    public static int orderAgnosticBinarySearch(int[] arr, int len, int target) {
        int start = 0, end = len - 1;
        if (arr[start] > arr[end]) {
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
        }
        else if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = start + (end - end) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                else if (arr[mid] < target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
