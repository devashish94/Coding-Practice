public class _06_Review_Loops {
    public static void main(String[] args) {
        java.util.Scanner read = new java.util.Scanner(System.in);
        int t = read.nextInt();
        while (t-- > 0) {
            String input = read.next();
            for (int i = 0; i < input.length(); i += 2) {
                System.out.print(input.charAt(i));
            }
            System.out.print(' ');
            for (int i = 1; i < input.length(); i += 2) {
                System.out.print(input.charAt(i));
            }
            System.out.println();
        }
    }
}
