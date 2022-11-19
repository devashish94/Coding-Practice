import java.util.Scanner;

public final class IDE {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        while (x --> 0) {
            String s = read.next();
            solve(s);
        }
    }

    public static void solve(String s) {
        int left = 0;
        StringBuilder x = new StringBuilder();
        for (int i = 0; i < Math.ceil(s.length() / 3.0) + 1; i++) {
            x.append("Yes");
        }
        String t = x.toString();

        while (s.charAt(0) != t.charAt(left)) {
            left++;
            if (left == t.length()) {
                System.out.println("No");
                return;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(left)) {
                System.out.println("No");
                return;
            }
            left++;
        }
        System.out.println("Yes");
    }
}