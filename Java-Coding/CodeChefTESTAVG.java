import java.util.Scanner;

public class CodeChefTESTAVG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        float[] arr = new float[3];
        for (int i = 0; i < tc; i++) {
            arr[0] = in.nextInt();
            arr[1] = in.nextInt();
            arr[2] = in.nextInt();
            if (marking(arr) == 0) {
                System.out.println("Fail");
            }
            else if (marking(arr) == 1) {
                System.out.println("Pass");
            }
        }
    }
    private static int marking(float[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (((arr[i] +  arr[j]) / 2) < 35.0) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
