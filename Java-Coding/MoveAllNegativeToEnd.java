import java.io.*;
import java.util.*;

public class MoveAllNegativeToEnd {
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
//        System.out.println(Arrays.toString(segregateElements(arr, 8)));
        segregateElements(arr, 8);
    }


    public static void segregateElements(int arr[], int n)
    {
        int[] temp = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                temp[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[count] = arr[i];
                count++;
            }
        }
        arr = temp;
        System.out.println(Arrays.toString(arr));
//        return arr;
    }
}