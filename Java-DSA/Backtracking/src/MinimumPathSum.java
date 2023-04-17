public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        minPathSum(arr);
    }

    private static int anyPathSum(int[][] arr) {
        int sum = 0;
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            sum += arr[i][j];
            i++;
        }
        while (j < arr[i - 1].length) {
            sum += arr[i - 1][j];
            j++;
        }
        return sum;
    }

    private static void minPathSum(int[][] arr) {
        int row = 0;
        int col = 0;
        int sum = 0;
        int maxSum = anyPathSum(arr);
//        String output = "";
        travel(row, col, sum, maxSum, arr);
    }

    private static void travel(int row, int col, int sum, int maxSum, int[][] arr) {
        if (row == arr.length || col == arr[row].length) {
            return;
        }
        if (row == arr.length - 1 && col == arr[row].length - 1) {
//            output += "(" + row + ", " + col + ") ";
//            System.out.println(output);
            if (sum < maxSum) {
                maxSum = sum;
                System.out.println(maxSum);
            }
            return;
        }
//        travel(row + 1, col, output + "(" + row + ", " + col + ") ", arr);
//        travel(row, col + 1, output + "(" + row + ", " + col + ") ", arr);
        travel(row + 1, col, sum + arr[row][col], maxSum, arr);
        travel(row, col + 1, sum + arr[row][col], maxSum, arr);
    }
}
