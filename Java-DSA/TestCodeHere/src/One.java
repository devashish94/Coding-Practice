import java.util.*;

public class One {
    public static void main(String[] args) {
        f(10);
    }
    private static void f(int n) {
        if (n < 1) return;
        System.out.println(n);
        f(n - 1);
    }
}
