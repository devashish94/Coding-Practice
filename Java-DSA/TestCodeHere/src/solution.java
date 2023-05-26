import java.util.*;

public class solution {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int n = s.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(solution.splitArray(input));
    }

    public static boolean splitArray(int[] input) {
        int index = 0;
        int threeSum = 0;
        int fiveSum = 0;
        List<Integer> aux = new ArrayList<>();
        for (int i : input) {
            if (i % 3 == 0) {
                threeSum += i;
            } else if (i % 5 == 0) {
                fiveSum += i;
            } else {
                aux.add(i);
            }
        }
        return f(index, threeSum, fiveSum, aux);
    }

    public static boolean f(int index, int threeSum, int fiveSum, List<Integer> arr) {
        if (index == arr.size()) {
            return threeSum == fiveSum;
        }
        return f(index + 1, threeSum + arr.get(index), fiveSum, arr) ||
                f(index + 1, threeSum, fiveSum + arr.get(index), arr);
    }
}
