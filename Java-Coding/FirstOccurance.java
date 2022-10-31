public class FirstOccurance {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 3, 4, 4, 6, 10};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + " --> " + nums[i] + " \t" + firstOccurance(nums, nums[i]));
        }
    }

    public static int firstOccurance(int[] arr, int target) {
        int start = 0, end = arr.length - 1, result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                result = mid;
                end = mid - 1; // Because the first occurance will exist in the left direction so we need to traverse to the left
            }
        }
        return result;
    }
}
