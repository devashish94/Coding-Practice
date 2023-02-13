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
        helperFunction(candidates, target, 0, 0, new LinkedList<>(), allCombinations);
        return allCombinations;
    }

    private static void helperFunction(
            int[] candidates,
            int target,
            int index,
            int currentSum,
            List<Integer> currentCombination,
            List<List<Integer>> allCombinations) {

        if (index == candidates.length) {
            return;
        }
        if (currentSum == target) {
            allCombinations.add(new LinkedList<>(currentCombination));
            return;
        }
        if (currentSum < target) {
            currentSum += candidates[index];
            currentCombination.add(candidates[index]);
            helperFunction( /* Include */
                    candidates,
                    target,
                    index,
                    currentSum,
                    currentCombination,
                    allCombinations
            );
            currentSum -= candidates[index];
            currentCombination.remove(currentCombination.size() - 1);
        }
        helperFunction( /* Not Include */
                candidates,
                target,
                index + 1,
                currentSum,
                currentCombination,
                allCombinations
        );
    }
}
