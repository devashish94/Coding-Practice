import java.util.Scanner;

class IDE {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while (t --> 0) {
            int n = read.nextInt();
            System.out.println(n);
        }
    }
}