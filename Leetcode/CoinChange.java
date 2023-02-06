import java.util.*;

public class CoinChange {
    public static void main(String[] args) {
//        Integer[] coins = {1, 2, 3};
        Integer[] coins = {2, 5, 3, 6};
//        int amount = 4;
        int amount = 10;
        CoinChange solution = new CoinChange();
        System.out.print(solution.coinChange(coins, amount));
    }
    public int coinChange(Integer[] coins, int amount) {
        int currentAmount = 0, i = 0;
        Set<String> allCombinations = new HashSet<>();
        String empty = "";
        helper(i, coins, empty, currentAmount, amount, allCombinations);
        System.out.println(allCombinations);
        return 0;
    }

    private void helper (
            int i,
            Integer[] coins,
            String empty,
            int currentAmount,
            int amount,
            Set<String> allCombinations
    ) {
        if (currentAmount > amount) {
            System.out.print("[FAIL] ");
            return;
        }
        if (currentAmount == amount) {
            System.out.print("[ADDED-ENTRY] ");
            allCombinations.add(empty);
            return;
        }
        if (i >= coins.length) {
            System.out.print("[ARRAY-OUT] ");
            return;
        }
        System.out.print("[UPDATING] ");
        empty += coins[i];
        currentAmount += coins[i];
        System.out.println("before: empty = " + empty + ", currentAmount = " + currentAmount);
        helper(i + 1, coins, empty, currentAmount, amount, allCombinations);
        System.out.println("after: empty = " + empty + ", currentAmount = " + currentAmount);
        helper(i, coins, empty, currentAmount, amount, allCombinations);
    }
}
