import java.util.*;

public class Testing {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        editArray(0, 0, arr);
    }

    private static void editArray(int x, int y, int[][] arr) {
        if (x < 0 || x >= arr.length || y >= arr[x].length || y < 0) return;
        arr[x][y] = 1;
        editArray(x, y + 1, arr);
        editArray(x + 1, y, arr);
    }
}
