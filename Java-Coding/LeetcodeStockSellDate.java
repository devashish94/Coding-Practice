//Got TLE in this one
//public class Solution {
//    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
//        int max = 0;
//        for (int i = 0; i < prices.length - 1; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                if (prices[j] - prices[i] > max && i < j) {
//                    max = prices[j] - prices[i];
//                    System.out.printf("(%d, %d) %d - %d = %d\n", i, j, prices[j], prices[i], max);
//                }
//            }
//        }
//        System.out.println(max);
//    }
//}
public class LeetcodeStockSellDate {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int max = 0, current = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] - current > max) {
//                prices[]
            }
        }
    }
}