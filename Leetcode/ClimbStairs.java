public class ClimbStairs {
    static long[] arr = new long[1000];

    public static void main(String[] args) {
        System.out.println(climbStairs(999));
    }
    public static long climbStairs(int n) {
        if (arr[n] != 0) {
            return arr[n];
        }
        if (n <= 3) {
            return n;
        }
        arr[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return arr[n];
    }
}
