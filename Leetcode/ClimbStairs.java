public class ClimbStairs {
    static int[] arr = new int[46];

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
    public static int climbStairs(int n) {
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
