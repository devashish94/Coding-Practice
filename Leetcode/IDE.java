import java.io.*;
import java.util.*;

public class IDE {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {st = new StringTokenizer(br.readLine());}
                catch (IOException e) {e.printStackTrace();}
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        FastReader read = new FastReader();
        int t = read.nextInt();
        int[] testCaseSize = new int[t];
        String[] testCaseString = new String[t];
        for (int i = 0; i < t; i++) {
            testCaseSize[i] = read.nextInt();
            testCaseString[i] = read.next();
        }
        solveTestCases(t, testCaseSize, testCaseString);
    }

    private static void solveTestCases(int t, int[] testCaseSize, String[] testCaseString) {
        for (int i = 0; i < t; i++) {
            testCase(testCaseSize[i], testCaseString[i]);
        }
    }

    private static void testCase(int n, String s) {
        int[] leftDistinct = new int[n], rightDistinct = new int[n];
        char[] leftHash = new char[26], rightHash = new char[26];
        int distinctCountLeft = 0, distinctCountRight = 0;
        for (int i = 0; i < n; i++) {
            int calculateIndex = s.charAt(i) - 'a';
            if (leftHash[calculateIndex] == 0) {
                distinctCountLeft++;
            }
            leftHash[calculateIndex] = 1;
            leftDistinct[i] = distinctCountLeft;
        }
        for (int i = n - 1; i >= 0; i--) {
            int calculateIndex = s.charAt(i) - 'a';
            if (rightHash[calculateIndex] == 0) {
                distinctCountRight++;
            }
            rightHash[calculateIndex] = 1;
            rightDistinct[i] = distinctCountRight;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int value = leftDistinct[i] + rightDistinct[i + 1];
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }
}
