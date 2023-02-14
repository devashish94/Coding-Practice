/* https://leetcode.com/problems/combination-sum/ */

import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        CombinationSum solution = new CombinationSum();
        int[] candidates = {1, 2, 3};
        int target = 4;
        System.out.println(solution.combinationSum(candidates, target));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allCombinations = new LinkedList<>();
        List<Integer> child = new LinkedList<>();
        helperFunction(candidates, target, 0, 0, child, allCombinations);
        return allCombinations;
    }

    private static void helperFunction(
            int[] candidates,
            int target,
            int index,
            int currentSum,
            List<Integer> currentCombination,
            List<List<Integer>> allCombinations) {

        if (index == candidates.length || currentSum > target) {
            return;
        }
        if (currentSum == target) {
            allCombinations.add(new LinkedList<>(currentCombination));
            return;
        }
        currentCombination.add(candidates[index]);
        helperFunction(candidates, target, index, currentSum + candidates[index], currentCombination, allCombinations);
        currentCombination.remove(currentCombination.size() - 1);
        helperFunction(candidates, target, index + 1, currentSum, currentCombination, allCombinations);
    }
}
