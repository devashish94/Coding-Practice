import java.util.Scanner;

public final class Solution {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String layout = "qwertyuiopasdfghjkl;zxcvbnm,./";

        char shift = read.next().charAt(0);
        String inputString = read.next();

        for (char character : inputString.toCharArray()) {
            int index = layout.indexOf(character);
            if (shift == 'L') {
                System.out.print(layout.charAt(index + 1));
            } else {
                System.out.print(layout.charAt(index - 1));
            }
        }
    }
}
