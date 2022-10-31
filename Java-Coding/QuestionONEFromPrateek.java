import java.util.Scanner;
class QuestionFromPrateek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter: ");
        int n = in.nextInt();
        if (n % 2 != 0) { 
            System.out.println("weird really weird ODD");
        }
        else if (n % 2 == 0 && (n >= 2 && n <= 5)) {
            System.out.println("Not weird");
        }
        else if (n % 2 == 0 && (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        }
        else if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        }
    }
}
