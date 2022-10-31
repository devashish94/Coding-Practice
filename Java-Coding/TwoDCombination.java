import java.util.Arrays;
// [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
public class TwoDCombination {
    public static void main(String[] args) {
        // int[][] arr = {{1, 1}, {2, 2}, {3, 3}};
        int[][] arr = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    // System.out.print(Arrays.toString(arr[i]) + "|");
                    // System.out.print(Arrays.toString(arr[j]) + "|");
                    // System.out.print(Arrays.toString(arr[k]) + ", ");
                    if ((arr[i][0]*(arr[j][1]-arr[k][1])) + (arr[j][0]*(arr[k][1]-arr[i][1])) + (arr[k][0]*(arr[i][1]-arr[j][1])) == 0) {
                        System.out.println(Arrays.toString(arr[i]) + " " + Arrays.toString(arr[j]) + " " + Arrays.toString(arr[k]));
                    }
                }
                // System.out.println();
            }
        }
    }
}
