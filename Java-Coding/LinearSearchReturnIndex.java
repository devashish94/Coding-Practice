import java.util.Scanner;
import java.util.Arrays;

public class LinearSearchReturnIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Start Entering each element of the array");

        for (int i = 0; i != size; i++) {
            System.out.print("Element at position (" + i + "): ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is " + Arrays.toString(arr));
        
        System.out.print("Enter the number you want to search in the array: ");
        int target = sc.nextInt();
        sc.close();

        int answer = giveIndex(arr, target);
        
        System.out.println("Index of the target element is " + answer);
    }

    public static int giveIndex(int[] arr, int target) {
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return 0;
    }
}    
