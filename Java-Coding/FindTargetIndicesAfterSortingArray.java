// You are given a 0-indexed integer array nums and a target element target.
// A target index is an index i such that nums[i] == target.
// Return a list of the target indices of nums after sorting nums in non-decreasing order.
// If there are no target indices, return an empty list.
// The returned list must be sorted in increasing order.

import java.util.*;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        System.out.println(targetIndices(nums, 4));
    }

    //THIS IS BINARY SEARCH METHOD
    public static List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr); // Sorting the Array as asked in the Question
        List<Integer> indices = new ArrayList<>(); // Initializing the answer ArrayList

        int firstOccurance, lastOccurance;

        //Finding the First Occurance
        firstOccurance = firstOccurance(arr, target);

        //Finding the Last Occurance
        lastOccurance = lastOccurance(arr, target);

        // If target NOT found
        if (firstOccurance == -1 && lastOccurance == -1) {
            return new ArrayList<>();
        }
        // If target FOUND
        for (int i = firstOccurance; i <= lastOccurance; i++) {
            indices.add(i);
        }
        if (indices.size() != 0) {
            return indices;
        }
        return new ArrayList<>(); // The code will most probably not touch this line
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

    public static int lastOccurance(int[] arr, int target) {
        int start = 0, end = arr.length - 1, result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                result = mid;
                start = mid + 1; // Because the last occurance will exist in the right direction so we need to traverse to the right
            }
        }
        return result;
    }
}
