import java.util.*;

public class IDE {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            int s = read.nextInt();
            solve(s);
        }
    }
    private static void solve(int s) {
        int spend = 0, x = 10;
        while (s > 0) {
            if (s < x) {
                spend += s;
                break;
            }
            spend += x;
            s -= x;
            s += x / 10;
            System.out.println(s);
        }
        System.out.println(spend);
    }
}
