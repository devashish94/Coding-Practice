import java.util.*;

public class Two {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> child = new ArrayList<>();
        adding(arr, child);
        System.out.println(arr);
    }

    private static void adding(List<List<Integer>> arr, List<Integer> child) {
        int[] candidates = {1, 2, 3, 4};
        for (int candidate : candidates) {
            child.add(candidate);
            arr.add(child);
        }
    }
}
