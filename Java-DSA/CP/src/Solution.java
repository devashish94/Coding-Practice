import java.util.*;

public final class Solution {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            String s = read.next();
            int oneCount = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') oneCount++;
            }
            System.out.println((Math.min(oneCount, s.length() - oneCount) & 1) == 1 ? "DA" : "NET");
        }
    }
}
