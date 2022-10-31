public class TwoDMatrixPrintSingleLoop {
    public static void main(String[] args) {
//        int[][] arr =  {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
        int[][] arr = {{1, 3}};
        int row = arr.length, column = arr[0].length, low = 0, high = row * column - 1, target = 3;

        //Searching for the element "TARGET = 6" in the given 2D Matrix
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid / column][mid % column] == target) {
                System.out.println(true + ", at coordinate " + "(" + mid / column + ", " + mid % column + ")");
                break;
            }
            else if (arr[mid / column][mid % column] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
    }
}
