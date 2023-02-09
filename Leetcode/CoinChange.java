import java.util.*;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {2, 5, 3, 6};
        int amount = 10;
        System.out.println("Answer: " + count(coins, coins.length, amount));
    }

    public static long count(int[] coins, int N, int sum) {
        return f(0, 0, coins, sum);
    }

    private static int f(int i, int sum, int[] coins, int amount) {
        if (i >= coins.length || sum > amount) {
            return 0;
        }
        if (sum == amount) {
            return 1;
        }
        int deep = f(i, sum + coins[i], coins, amount);
        int next = f(i + 1, sum, coins, amount);
        return deep + next;
     }
}
