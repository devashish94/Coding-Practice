public class SingleNumberLeetcode {
    public static void main(String[] args) {
        int[] arr = {2,1,2};
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(arr));
    }
}

class Solution {
    public int singleNumber(int[] arr) {
        int result = 0;
        for (int j : arr) {
            result ^= j;
        }
        return result;
    }
}