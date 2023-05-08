import java.util.*;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        minPathSum(arr);
    }

    private static void minPathSum(int[][] arr) {
        int row = 0;
        int col = 0;
        int sum = 0;
        List<Integer> save = new ArrayList<>();
        travel(row, col, sum, arr, save);
        System.out.println(minValue(save));
    }

    private static int minValue(List<Integer> save) {
        int min = save.get(0);
        for (int i : save) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    private static void travel(int row, int col, int sum, int[][] arr, List<Integer> save) {
        if (row == arr.length || col == arr[row].length) {
            return;
        }
        if (row == arr.length - 1 && col == arr[row].length - 1) {
            sum += arr[row][col];
            save.add(sum);
            return;
        }
        travel(row + 1, col, sum + arr[row][col], arr, save);
        travel(row, col + 1, sum + arr[row][col], arr, save);
    }
}
