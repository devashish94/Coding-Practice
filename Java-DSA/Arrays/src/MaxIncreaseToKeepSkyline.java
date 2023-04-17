import java.util.*;

public class MaxIncreaseToKeepSkyline {
    public static void main(String[] args) {
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9,2,6,3}, {0, 3, 1, 0}};
        System.out.println(
                new MaxIncreaseToKeepSkyline()
                .maxIncreaseKeepingSkyline(grid)
        );
    }
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] vertical = new int[grid.length];
        int[] horizontal = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            int maxHorizontal = Integer.MIN_VALUE;
            int maxVertical = Integer.MIN_VALUE;
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > maxHorizontal) {
                    maxHorizontal = grid[i][j];
                }
                if (grid[j][i] > maxVertical) {
                    maxVertical = grid[j][i]; // this logic only works on Square Matrix
                }
            }
            horizontal[i] = maxHorizontal;
            vertical[i] = maxVertical;
        }

        int totalSum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                totalSum += Math.min(horizontal[i], vertical[j]) - grid[i][j];
            }
        }
        return totalSum;
    }
}
