public class Print {
    public static void main(String[] args) {
        int n = 10;
        printing(n);
    }

    private static void printing(int n) {
        if (n < 1) {
            return;
        }
        printing(n - 1);
        System.out.print(n + " ");
    }
}
