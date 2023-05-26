import java.util.*;

class IDE {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int n = read.nextInt();
            String s = read.next();
            char ch = s.charAt(0);
            int count = 2;
            int tempCount = 2;
            for (int i = 1; i < s.length(); i++) {
                if (ch == s.charAt(i)) {
                    tempCount++;
                } else {
                    tempCount = 2;
                    ch = s.charAt(i);
                }
                count = Math.max(tempCount, count);
            }
            System.out.println(count);
        }
    }
}
