import java.util.ArrayList;

public class CodeTesting {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int[] result1 = new int[4];
        System.out.println("Check in the arrayList "+ binaryCheck(result, 3));
        System.out.println("Check in the regular array " + binaryCheck(result, 3));
    }

    public static int binaryCheck(ArrayList<Integer> arr, int target) {
        int start = 0, end = arr.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) == target) {
                return mid;
            }
            else if (arr.get(mid) < target) {
                start = mid + 1;
            }
            else if (arr.get(mid) > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binaryCheck(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

}
