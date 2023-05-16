import java.util.Scanner;

public class _01_Data_Types {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "Hackerrank ";
        int secondInt = scan.nextInt();
        double secondDouble = scan.nextDouble();
        scan.nextLine();
        String secondString = scan.nextLine();
        System.out.println(i + secondInt);
        System.out.println(d + secondDouble);
        System.out.println(s + " " + secondString);
    }
}
