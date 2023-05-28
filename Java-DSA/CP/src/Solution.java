import java.util.*;

public final class Solution {
    static List<Long> save = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {-4,-5,-4};
        System.out.println(new Solution().maxStrength(arr));
        System.out.println(save);
    }

    public long maxStrength(int[] arr) {
        f(0, arr, new ArrayList<>());
        long max = max(save);
        System.out.println("Max: " + max);
        return max;
    }

    private static Long max(List<Long> output) {
        Long max = output.get(0);
        for (Long i : output) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    private void f(int i, int[] input, List<Integer> output) {
        if (i == input.length) {
            if (output.size() == 0) {
                return;
            }
            save.add(prod(output));
            System.out.println(output);
            return;
        }
        f(i + 1, input, output);
        output.add(input[i]);
        f(i + 1, input, output);
        output.remove(output.size() - 1);
    }

    private long prod(List<Integer> output) {
        int prod = 1;
        for (int i : output) {
            prod *= i;
        }
        return prod;
    }
}
