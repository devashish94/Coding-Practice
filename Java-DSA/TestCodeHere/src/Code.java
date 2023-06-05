import java.util.*;

public class Code {
    public static void main(String[] args) {
        int[][] m = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int n = m.length;
        System.out.println(findPath(m, n));
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        int row = 0;
        int col = 0;
        String path = "";
        ArrayList<String> save = new ArrayList<>();
        travel(row, col, path, save, m);
        return save;
    }
    private static void travel(int row, int col, String path, ArrayList<String> save, int[][] m) {
        if (row == m.length - 1 && col == m[0].length - 1) {
            System.out.println(path);
            save.add(path);
            return;
        }
        if (row + 1 < m.length && m[row + 1][col] == 1) {
            m[row][col] = 0;
            travel(row + 1, col, path + "D", save, m);
            m[row][col] = 1;
        }
        if (row - 1 > 0 && m[row - 1][col] == 1) {
            m[row][col] = 0;
            travel(row - 1, col, path + "U", save, m);
            m[row][col] = 1;
        }
        if (col - 1 > 0 && m[row][col - 1] == 1) {
            m[row][col] = 0;
            travel(row, col - 1, path + "L", save, m);
            m[row][col] = 1;
        }
        if (col + 1 < m[0].length && m[row][col + 1] == 1) {
            m[row][col] = 0;
            travel(row, col + 1, path + "R", save, m);
            m[row][col] = 1;
        }
    }
}
