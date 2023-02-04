import java.util.Arrays;

public class TestingPieces {

    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        System.out.println(sameDiag(3, 2, arr));
    }

    private static boolean danger(int x, int y, int[][] arr) {
        boolean outOfBounds = outOfBounds(x, y, arr);
        boolean sameRow = sameRow(x, y, arr);
        boolean sameColumn = sameCol(x, y, arr);
        boolean onDiagonal = sameDiag(x, y, arr);
        return outOfBounds || sameColumn || sameRow || onDiagonal;
    }

    private static boolean outOfBounds(int x, int y, int[][] arr) {
        return x < 0 || y < 0 || x > arr.length - 1 || y > arr[x].length - 1;
    }

    private static boolean sameDiag(int x, int y, int[][] arr) {
        boolean northEast = onNorthEast(x, y, arr);
        boolean northWest = onNorthWest(x, y, arr);
        boolean southEast = onSouthEast(x, y, arr);
        boolean southWest = onSouthWest(x, y, arr);
        return northEast || northWest || southEast || southWest;
    }

    private static boolean onNorthWest(int x, int y, int[][] arr) {
        if (outOfBounds(x, y, arr)) {
            return false;
        } else if (arr[x][y] == 1) {
            return true;
        }
        return onNorthWest(x - 1, y - 1, arr);
    }

    private static boolean onNorthEast(int x, int y, int[][] arr) {
        if (outOfBounds(x, y, arr)) {
            return false;
        } else if (arr[x][y] == 1) {
            return true;
        }
        return onNorthEast(x - 1, y + 1, arr);
    }

    private static boolean onSouthWest(int x, int y, int[][] arr) {
        if (outOfBounds(x, y, arr)) {
            return false;
        } else if (arr[x][y] == 1) {
            return true;
        }
        return onSouthWest(x + 1, y - 1, arr);
    }

    private static boolean onSouthEast(int x, int y, int[][] arr) {
        if (outOfBounds(x, y, arr)) {
            return false;
        } else if (arr[x][y] == 1) {
            return true;
        }
        return onSouthEast(x + 1, y + 1, arr);
    }

    private static boolean sameCol(int x, int y, int[][] arr) {
        return onAbove(x, y, arr) || onBottom(x, y, arr);
    }

    private static boolean sameRow(int x, int y, int[][] arr) {
        return onRight(x, y, arr) || onLeft(x, y, arr);
    }

    private static boolean onBottom(int x, int y, int[][] arr) {
        if (x > arr.length - 1) {
            return false;
        } else if (arr[x][y] == 1) {
            return true;
        }
        return onBottom(x + 1, y, arr);
    }

    private static boolean onAbove(int x, int y, int[][] arr) {
        if (x < 0) {
            return false;
        } else if (arr[x][y] == 1) {
            return true;
        }
        return onAbove(x - 1, y, arr);
    }

    private static boolean onRight(int x, int y, int[][] arr) {
        if (y > arr[x].length - 1) {
            return false;
        } else if (arr[x][y] == 1) {
            return true;
        }
        return onRight(x, y + 1, arr);
    }

    private static boolean onLeft(int x, int y, int[][] arr) {
        if (y < 0) {
            return false;
        } else if (arr[x][y] == 1) {
            return true;
        }
        return onLeft(x, y - 1, arr);
    }


    private static void printer(int[][] arr) {
        for (var i : arr) System.out.println(Arrays.toString(i));
        System.out.println("---------------");
    }
}
