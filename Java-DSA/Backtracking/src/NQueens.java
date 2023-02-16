import java.util.*;

class NQueens {
    public static void main(String[] args) {
        List<List<String>> arr = solveNQueens(7);
        System.out.println(arr);
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] currentBoard = new char[n][n];
        solution(0, currentBoard, allBoards);
        return allBoards;
    }

    private static void addBoard(char[][] currentBoard, List<List<String>> allBoards) {
        List<String> board = new ArrayList<>();
        for (char[] row : currentBoard) {
            StringBuilder eachRow = new StringBuilder();
            for (char c : row) {
                if (c == 'Q') {
                    eachRow.append('Q');
                } else {
                    eachRow.append('.');
                }
            }
            board.add(eachRow.toString());
        }
        allBoards.add(board);
    }

    private static void solution(int row, char[][] currentBoard, List<List<String>> allBoards) {
        if (row == currentBoard.length) {
            addBoard(currentBoard, allBoards);
            return;
        }
        for (int column = 0; column < currentBoard.length; column++) {
            if (!danger(row, column, currentBoard)) {
                currentBoard[row][column] = 'Q';
                solution(row + 1, currentBoard, allBoards);
                currentBoard[row][column] = '-';
            }
        }
    }

    private static boolean danger(int x, int y, char[][] arr) {
        boolean sameColumn = sameCol(x, y, arr);
        boolean onDiagonal = sameDiagonal(x, y, arr);
        return sameColumn || onDiagonal;
    }

    private static boolean sameDiagonal(int x, int y, char[][] arr) {
        boolean northEast = onNorthEast(x, y, arr);
        boolean northWest = onNorthWest(x, y, arr);
        return northEast || northWest;
    }

    private static boolean onNorthWest(int x, int y, char[][] arr) {
        int i = x, j = y;
        while (i >= 0 && j >= 0) {
            if (arr[i][j] == 'Q') {
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
            if (arr[i][j] == 'Q') {
                return true;
            }
            i--;
            j++;
        }
        return false;
    }

    private static boolean sameCol(int x, int y, char[][] arr) {
        return onAbove(x, y, arr);
    }

    private static boolean onAbove(int x, int y, char[][] arr) {
        int i = x;
        while (i >= 0) {
            if (arr[i][y] == 'Q') {
                return true;
            }
            i--;
        }
        return false;
    }
}