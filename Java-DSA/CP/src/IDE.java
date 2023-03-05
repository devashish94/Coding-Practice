import java.util.Scanner;

// make a quadratic equation graph

public class IDE {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            for (int j = i; j * j < i; j++) {
                System.out.print("\t");
            }
            System.out.println("*");
        }
    }
}
