import java.util.*;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
//        int[] coins = {2, 5, 3, 6};
        int amount = 4;
//        int amount = 10;
        CoinChange solution = new CoinChange();
        System.out.println(solution.coinChange(coins, amount));
    }
    public int coinChange(int[] coins, int amount) {
        int currentAmount = 0, i = 0;
        ArrayList<LinkedList<Integer>> allCombinations = new ArrayList<>();
        LinkedList<Integer> empty = new LinkedList<>();
        helper(i, coins, empty, currentAmount, amount, allCombinations);
        System.out.println(allCombinations);
        return 0;
    }

    private void helper(int i, int[] coins, LinkedList<Integer> empty, int currentAmount, int amount, ArrayList<LinkedList<Integer>> allCombinations) {
        if (i >= coins.length) {
            return;
        }
        if (currentAmount > amount) {
            empty.removeLast();
            return;
        }
        if (currentAmount == amount) {
            allCombinations.add(empty);
            empty.removeLast();
            return;
        }
        empty.addLast(coins[i]);
        helper(i, coins, empty, currentAmount + coins[i], amount, allCombinations);
        helper(i + 1, coins, empty, currentAmount + coins[i], amount, allCombinations);
    }
}
