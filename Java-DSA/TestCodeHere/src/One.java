import java.util.*;

public class One {
    static List<String> save = new LinkedList<>();

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int sum = 7;
        int answer = helper(0, "", 0, arr, sum);
        System.out.println(answer);
        System.out.println(save);
    }

    private static int helper(int i, String s, int currentSum, int[] arr, int sum) {
        if (i >= arr.length || currentSum > sum) {
            return 0;
        }
        if (currentSum == sum) {
            save.add(s);
            return 1;
        }
        return helper(i, s + arr[i], currentSum + arr[i], arr, sum)
        + helper(i + 1, s, currentSum, arr, sum);
    }
}
