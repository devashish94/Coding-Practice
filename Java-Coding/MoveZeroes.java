public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] arr) {
        System.out.print("Original = ");
        printArray(arr); //debugging
        System.out.println();
        System.out.println("----------------------------------");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("j: " + j);
            iterativeSwapping(arr, j);
            System.out.println("----------------------------------");
        }
        System.out.print("Array After Moving: ");
        printArray(arr); //debugging
    }
    public static void iterativeSwapping(int[] arr, int j) {
        for (int i = 0; i < arr.length - 1 - j; i++) {
            if (arr[i] == 0 && arr[i + 1] != 0) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
            System.out.print("i = " + i + ", ");
            printArray(arr); //debugging
            System.out.println();
        }
    }
    public static void printArray(int[] arr) {
        for (int print = 0; print < arr.length; print++) {
            System.out.print( arr[print] + " ");
        }
    }
}

