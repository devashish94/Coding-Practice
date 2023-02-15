import java.util.*;

public class GfgCombinationSum {
    public static void main(String[] args) {
        Integer[] arr = {8, 1, 8, 6, 8};
        int target = 12;
        ArrayList<Integer> coins = new ArrayList<>(List.of(arr));
        ArrayList<ArrayList<Integer>> answer = combinationSum(coins, target);
        for (var i : answer) System.out.println(i);
    }
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> coins, int target) {
        ArrayList<ArrayList<Integer>> all = new ArrayList<>();
        Collections.sort(coins);
        TreeSet<Integer> set = new TreeSet<>(coins);
        coins.clear();
        coins.addAll(set);
        helper(0, 0, coins, new ArrayList<>(), target, all);
        return all;
    }

    private static void helper(
            int i,
            int sum,
            ArrayList<Integer> coins,
            ArrayList<Integer> fill,
            int target,
            ArrayList<ArrayList<Integer>> all) {
        if (i == coins.size() || sum > target) {
            return;
        }
        if (sum == target) {
            all.add(new ArrayList<>(fill));
            return;
        }
        fill.add(coins.get(i));
        helper(i, sum + coins.get(i), coins, fill, target, all);
        fill.remove(fill.size() - 1);
        helper(i + 1, sum, coins, fill, target, all);
    }
}













