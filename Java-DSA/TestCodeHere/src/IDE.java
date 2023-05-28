import java.util.*;

class IDE {
    public static void main(String[] args) {
        int[] arr = {6,-3,-4,8,4,7,6,4,7,7,-3,-6,9};
        System.out.println(new IDE().maxStrength(arr));
    }

    public long maxStrength(int[] arr) {
        List<Long> save = new ArrayList<>();
        f(0, arr, new ArrayList<>(), save);
        return java.util.Collections.max(save);
    }

    private void f(int i, int[] input, List<Integer> output, List<Long> save) {
        if (i == input.length) {
            if (output.size() == 0) {
                return;
            }
            save.add(prod(output));
            return;
        }
        f(i + 1, input, output, save);
        output.add(input[i]);
        f(i + 1, input, output, save);
        output.remove(output.size() - 1);
    }

    private long prod(List<Integer> output) {
        long prod = 1;
        for (int i : output) {
            prod *= i;
        }
        return prod;
    }
}
