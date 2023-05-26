import java.util.*;

public final class Solution {
    public static void main(String[] args) {
        int[][] grid = {
                {2, 4, 3, 5},
                {5, 4, 9, 3},
                {3, 4, 2, 11},
                {10, 9, 13, 15}
        };
        System.out.println(new Solution().maxMoves(grid));
    }
    public int maxMoves(int[][] grid) {
        int row = 0;
        int col = 0;
        return f(row, col, grid);
    }
    private int f(int row, int col, int[][] grid) {
        int right = col + 1 < grid[row].length && grid[row][col + 1] > grid[row][col] ? 1 + f(row, col + 1, grid) : 0;
        int rightUp = row - 1 > 0 && col + 1 < grid[row].length && grid[row - 1][col + 1] > grid[row][col] ? 1 + f(row - 1, col + 1, grid) : 0;
        int rightDown = row + 1 < grid.length && col + 1 < grid[row].length && grid[row + 1][col + 1] > grid[row][col] ? 1 + f(row + 1, col + 1, grid) : 0;
        return max(new int[] {right, rightUp, rightDown});
    }
    private static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
