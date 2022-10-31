public class FibonacciSeries {
    public static void main(String[] args) {
        // To Print the following series --> 0 1 1 2 3 5 8
        int first = 0, second = 1;
        int nextTerm = first + second;
        System.out.print(first + " " + second);

        for (int i = 0; i < 5; i++) {
            System.out.print(" " + nextTerm);
            first = second;
            second = nextTerm;
            nextTerm = first + second;
        }
    }
}
