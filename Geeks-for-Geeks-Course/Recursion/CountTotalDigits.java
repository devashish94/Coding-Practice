package Recursion;

public class CountTotalDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(123456));
    }
    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }
}
