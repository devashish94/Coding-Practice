import java.util.*;

public class MinimumTimeToVisitCell {
    Set<String> save = new HashSet<>();
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 3, 2}, {5, 1, 2, 5}, {4, 3, 8, 6}};
        System.out.println(new MinimumTimeToVisitCell().minimumTime(arr));
    }
    public int minimumTime(int[][] arr) {
        helper(0, 0, 0, arr);
        return 0;
    }
    private boolean isValid(int row, int col, int[][] arr) {
        return
            validLocation(row + 1, col, arr) &&
            validLocation(row - 1, col, arr) &&
            validLocation(row, col + 1, arr) &&
            validLocation(row, col - 1, arr);
    }
    private boolean validLocation(int row, int col, int[][] arr) {
        return row >= 0 && col >= 0 && row < arr.length && col < arr[row].length;
    }
    private boolean validSteps(int row, int col, int[][] arr, int steps) {
        return steps >= arr[row][col];
    }
    private void helper(int steps, int row, int col, int[][] arr) {
        if (row == arr.length - 1 && col == arr[row].length - 1) {
            System.out.println("Done, steps: " + steps);
            return;
        }
        if (validLocation(row, col + 1, arr) && validSteps(row, col + 1, arr, steps + 1)) {
            System.out.println("right");
            helper(steps + 1, row, col + 1, arr);
        }
        if (validLocation(row + 1, col, arr) && validSteps(row + 1, col, arr, steps + 1)) {
            System.out.println("down");
            helper(steps + 1, row + 1, col, arr);
        }
        if (validLocation(row, col - 1, arr) && validSteps(row, col - 1, arr, steps + 1)) {
            System.out.println("left");
            helper(steps + 1, row, col - 1, arr);
        }
        if (validLocation(row - 1, col, arr) && validSteps(row - 1, col, arr, steps + 1)) {
            System.out.println("up");
            helper(steps + 1, row - 1, col, arr);
        }
    }
}

// how to remove duplicate same tracks. it is just repeating the to-fro movement on the bottom. valve fix it