import java.util.*;

class IDE {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = read.nextInt();
        System.out.println("Array:\t" + Arrays.toString(arr));
        System.out.println("Answer:\t" + minJumps(arr));
    }
    static int minJumps(int[] arr){
        int i = 0, c = 0;
        while (i < arr.length - 1) {
            if (arr[i] == 0) return -1;
            i += arr[i];
            c++;
        }
        if (i ==  arr.length - 1) return c + 1;
        return c;
    }
}
