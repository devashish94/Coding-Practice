package AllPurposeIDE;

import java.util.Scanner;

public class Codeforces {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int T = read.nextInt();
        while (T-- > 0) {
            int n = read.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = read.nextInt();
            test_case(n, arr);
        }
    }

    private static void test_case(int n, int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int left_count = 0, right_count = 0;
            for (int i = 0; i < n; i++) if (arr[i] == 2) { if (i < k) left_count++; else right_count++; }
            if (left_count == right_count) { System.out.println(k); return; }
        }
        System.out.println(-1);
    }
}
