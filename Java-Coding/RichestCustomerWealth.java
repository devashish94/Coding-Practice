public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] nums = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(nums));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0, sum = 0;
        for (int k = 0; k < accounts[0].length; k++) {
            max += accounts[0][k];
        }
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
