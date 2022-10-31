//The Problem is to check if an integer X is a square of an integer without using any square root function.

public class SquareCheckUsingBinarySearch {
    public static void main(String[] args) {
        int a = 576;
        System.out.println("Square root of " + a + " is " + SquareRoot(a));

    }
    private static int SquareRoot(int a) {
        int start = 1, end = a;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == a) {
                return mid;
            }
            else if (mid * mid > a) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
