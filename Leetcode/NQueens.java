/* I will surely solve this Problem */
import java.util.*;

public class NQueens {
    Character fill = '.';    

    public static void main(String[] args) {
        Queens(5);
    }
    
    private static void Queens(int n) {
        NQueens solution = new NQueens();
        Queue<int[]> possibleCells = new LinkedList<int[]>(); 
        Character[][] arr = new Character[n][n];
        possibleCells.add(new int[] {0, 0});
        solution.crossDiagonals(0, 0, arr);
    }

    private static void banner() { System.out.println("################################################"); }

    private void crossDiagonals(int row, int col, Character[][] arr) {
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

    private void crossVertical(int row, int col, Character[][] arr) {
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

    private void crossHorizontal(int row, int col, Character[][] arr) {
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
