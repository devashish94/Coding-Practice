import java.util.*;

public class IslandPerimeter {
    public static void main(String[] args) {
//        int[][] arr = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int[][] arr = {{0}, {1}};
        System.out.println(new IslandPerimeter().islandPerimeter(arr));
    }
    public int islandPerimeter(int[][] arr) {
        int perimeter = 0;
        Queue<int[]> ones = new LinkedList<>();
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == 1) {
                    ones.add(new int[] {row, col});
                    break;
                }
            }
        }
        while (!ones.isEmpty()) {
            int[] get = ones.remove();
            int i = get[0];
            int j = get[1];
            perimeter += calculation(i, j, arr);
            if (!isOutOfBound(i + 1, j, arr) && arr[i + 1][j] == 1) {
                ones.add(new int[]{i + 1, j});
            }
            if (!isOutOfBound(i - 1, j, arr) && arr[i - 1][j] == 1) {
                ones.add(new int[]{i - 1, j});
            }
            if (!isOutOfBound(i, j + 1, arr) && arr[i][j + 1] == 1) {
                ones.add(new int[]{i, j + 1});
            }
            if (!isOutOfBound(i, j - 1, arr) && arr[i][j - 1] == 1) {
                ones.add(new int[]{i, j - 1});
            }
            arr[i][j] = 2;
        }
        return perimeter;
    }

    private int calculation(int i, int j, int[][] arr) {
        int perimeter = 0;
        if (!isOutOfBound(i + 1, j, arr) && arr[i + 1][j] == 0 && arr[i][j] == 1) {
            perimeter++;
        }
        if (!isOutOfBound(i - 1, j, arr) && arr[i - 1][j] == 0 && arr[i][j] == 1) {
            perimeter++;
        }
        if (!isOutOfBound(i, j + 1, arr) && arr[i][j + 1] == 0 && arr[i][j] == 1) {
            perimeter++;
        }
        if (!isOutOfBound(i, j - 1, arr) && arr[i][j - 1] == 0 && arr[i][j] == 1) {
            perimeter++;
        }
        if (isOutOfBound(i + 1, j, arr) && arr[i][j] == 1) {
            perimeter++;
        }
        if (isOutOfBound(i - 1, j, arr) && arr[i][j] == 1) {
            perimeter++;
        }
        if (isOutOfBound(i, j + 1, arr) && arr[i][j] == 1) {
            perimeter++;
        }
        if (isOutOfBound(i, j - 1, arr) && arr[i][j] == 1) {
            perimeter++;
        }
        return perimeter;
    }

    private static boolean isOutOfBound(int row, int col, int[][] arr) {
        return row >= arr.length || row < 0 || col >= arr[row].length || col < 0;
    }
}
