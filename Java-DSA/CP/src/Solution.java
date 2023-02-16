import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), minCapacity = Integer.MIN_VALUE, insideTrain = 0;
        while (n-- > 0) {
            int exiting = read.nextInt(), entering = read.nextInt();
            insideTrain -= exiting;
            insideTrain += entering;
            minCapacity = Math.max(insideTrain, minCapacity);
        }
        System.out.println(minCapacity);
    }
}
