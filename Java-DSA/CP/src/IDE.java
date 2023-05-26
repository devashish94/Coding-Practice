import java.util.*;

public class IDE {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 4; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.printf(i + " " + j + " " + k);
                    if (one(new int[] {i, j, k}) != two(i, j, k)) {
                        System.out.println("Not Equal, at: " + i + ' ' + j + ' ' + k);
                        break;
                    }
                }
            }
        }
        System.out.println("It is equal for all values up to: " + n);
    }
    private static int one(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    private static int two(int a, int b , int c) {
        return Math.max(a, Math.max(b, c));
    }
}
