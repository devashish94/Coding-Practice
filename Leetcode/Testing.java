import java.util.*;

class Testing {
    public static void main(String[] args) {
        int n = 3;
        char[][] arr = {{'Q', 'x', 'x'}, {'Q', 'x', 'Q'}, {'x', 'x', 'Q'}};
        System.out.println(sameDiag(0, 2, arr));
    }
    private static boolean sameDiag(int x, int y, char[][] arr) {
        boolean northEast = onNorthEast(x - 1, y + 1, arr);
        boolean northWest = onNorthWest(x - 1, y - 1, arr);
        boolean southEast = onSouthEast(x + 1, y + 1, arr);
        boolean southWest = onSouthWest(x + 1, y - 1, arr);
        return northEast || northWest || southEast || southWest;
    }

    private static boolean onNorthWest(int x, int y, char[][] arr) {
        int i = x, j = y;
        while (i >= 0 && j >= 0) {
            if (arr[i][j] == 1) {
                return true;
            }
            i--;
            j--;
        }
        return false;
    }

    private static boolean onNorthEast(int x, int y, char[][] arr) {
        int i = x, j = y;
        while (i >= 0 && j < arr[0].length) {
            if (arr[i][j] == 1) {
                return true;
            }
            i--;
            j++;
        }
        return false;
    }

    private static boolean onSouthWest(int x, int y, char[][] arr) {
        int i = x, j = y;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == 'Q') {
                return true;
            }
            i++;
            j--;
        }
        return false;
    }

    private static boolean onSouthEast(int x, int y, char[][] arr) {
        int i = x, j = y;
        while (i < arr.length && j < arr[0].length) {
            if (arr[i][j] == 'Q') {
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}