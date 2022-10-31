public class MaxElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
