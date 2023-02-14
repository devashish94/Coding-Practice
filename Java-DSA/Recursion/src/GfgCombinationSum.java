import java.util.*;

public class GfgCombinationSum {
    public static void main(String[] args) {
        Integer[] arr = {7,2,6,5};
        List<Integer> coins = Arrays.asList(arr);
        int target = 16;
        List<List<Integer>> answer = combinationSum(coins, target);
        for (List<Integer> i : answer) {
            System.out.println(i);
        }
    }
    static List<List<Integer>> combinationSum(List<Integer> coins, int target) {
        List<List<Integer>> all = new ArrayList<>();
        helper(0, coins, new ArrayList<>(), target, all);
        for (var i : all) {
            Collections.sort(i);
        }
        return all;
    }

    private static void helper(int i, List<Integer> coins, ArrayList<Integer> fill, int target, List<List<Integer>> all) {
        if (i == coins.size() || target < 0) {
            return;
        }
        if (target == 0) {
            all.add(new ArrayList<>(fill));
            return;
        }
        fill.add(coins.get(i));
        helper(i, coins, fill, target - coins.get(i), all);
        fill.remove(fill.size() - 1);
        helper(i + 1, coins, fill, target, all);
    }
}
