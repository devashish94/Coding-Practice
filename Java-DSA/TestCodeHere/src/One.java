import java.util.*;

public class One {
    private static long sum(Integer[] arr) {
        long sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int n = read.nextInt();
            int k = read.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = read.nextInt();
            }
            long sum = sum(arr);
            Arrays.sort(arr);
            long one = one(n, k, arr);
            long two = two(n, k, arr);
            long three = three(n, k, arr);
            long finalRemove = min(new long[] {one, two, three});
            System.out.println(sum - finalRemove);
        }
    }

    private static long min(long[] arr) {
        long min = arr[0];
        for (long j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    private static long one(int n, int k, Integer[] arr) {
        long one = 0;
        for (int i = 0; k > 0; i += 2) {
            one += arr[i] + arr[i + 1];
            k--;
        }
        return one;
    }

    private static long two(int n, int k, Integer[] arr) {
        long two = 0;
        for (int i = arr.length - 1; k > 0; i--) {
            two += arr[i];
            k--;
        }
        return two;
    }

    private static long three(int n, int k, Integer[] arr) {
        long three = 0;
        int left = 0;
        int right = arr.length - 1;
        while (k > 0) {
            if (arr[left] + arr[left + 1] < arr[right]) {
                three += arr[left] + arr[left + 1];
                left += 2;
            } else {
                three += arr[right];
                right--;
            }
            k--;
        }
        return three;
    }
}
