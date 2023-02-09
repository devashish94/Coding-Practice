package Recursion;

public class PowerUsingRecursion {
    public static void main(String[] args) {
        System.out.println(RecursivePower(2, 0));
    }
    static int RecursivePower(int n,int p) { // linear time O(n)
        if (p == 0) {
            return 1;
        }
        if (p < 2) {
            return n;
        }
        return n * RecursivePower(n, p - 1);
    }
}
