/*
 Problem with the logic right now:
    - It prints non-max arrays
    - It prints duplicate max arrays
 */

/* Refactoring done. Now it should be a little easier to scale the program. */
import java.util.ArrayList;
import java.util.Arrays;

public class NQueens {
    char fill = 'x';    

    public static void main(String[] args) {
        int n = 4;
        createQueenMatrix(n);
    }
    
    private static void createQueenMatrix(int n) {
        ArrayList<char[][]> maxQueenArrays = new ArrayList<>();
        int maxCount = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                char[][] arr = new char[n][n];
                fillDash(arr);
                int count = 0;
                setStartingPosition(row, col, arr);
                count++; // deliberately kept this here, otherwise would not understand why count 1.
                count = setFurtherPositions(arr, count);
                if (count >= maxCount) {
                    initialInformation(row, col, arr);
                    maxCount = count;
                    maxQueenArrays.add(arr);
                }
            }
        }
        System.out.println(n + " x " + n + " -> " + "Max Queens: " + maxCount);
        for (char[][] arrays : maxQueenArrays) {
            printGrid(arrays);
            banner();
        }
    } 

    private static void setStartingPosition(int row, int col, char[][] arr) {
        NQueens change = new NQueens();
        arr[row][col] = 'Q';
        change.crossHorizontal(row, col, arr);
        change.crossVertical(row, col, arr);
        change.crossDiagonals(row, col, arr);
    }
    
    private static int setFurtherPositions(char[][] arr, int count) {
        NQueens change = new NQueens();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == '-') {
                    arr[i][j] = 'Q';
                    count++;
                    change.crossHorizontal(i, j, arr);
                    change.crossVertical(i, j, arr);
                    change.crossDiagonals(i, j, arr);
                }
            }
        }
        return count;
    }

    private static void initialInformation(int row, int col, char[][] arr) {
        System.out.println("Matrix: " + arr.length + " x " + arr[row].length + ", initial: " + "(" + row + ", " + col + ")");
    }

    private static void getCount(int count) { System.out.println("count: " + count); }
    
    private static void banner() { System.out.println("-------------------------------"); }

    private static void printGrid(char[][] arr) {
        for (char[] i : arr) {
            for (char j : i) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    private static void fillDash(char[][] arr) {
        for (char[] i : arr) {
            Arrays.fill(i, '-');
        }
    }

    private void crossDiagonals(int row, int col, char[][] arr) {
        int saveRow = row - 1, saveCol = col - 1, saver = row - 1, savec = col + 1, r = row + 1, c = col - 1;
        // SE
        row++; col++;
        while (row < arr.length && col < arr[row].length) {
            arr[row][col] = this.fill;
            row++; col++;
        }
        // NW
        while (saveRow >= 0 && saveCol >= 0) {
            arr[saveRow][saveCol] = this.fill;
            saveRow--; saveCol--;
        }
        // NE   
        while (saver >= 0 && savec < arr[saver].length) {
            arr[saver][savec] = this.fill;
            saver--; savec++;
        }
        // SW
        while (r < arr.length && c >= 0) {
            arr[r][c] = this.fill;
            r++; c--;
        }
    }

    private void crossVertical(int row, int col, char[][] arr) {
        int saveRow = row - 1;
        row++;
        while(row < arr.length) {
            arr[row][col] = this.fill;
            row++;
        }
        while (saveRow >= 0) {
            arr[saveRow][col] = this.fill;
            saveRow--;
        }
    }

    private void crossHorizontal(int row, int col, char[][] arr) {
        int saveCol = col - 1;
        col++;
        while (col < arr[row].length) {
            arr[row][col] = this.fill;
            col++;
        }
        while (saveCol >= 0) {
            arr[row][saveCol] = this.fill;
            saveCol--;
        }
    }
}
