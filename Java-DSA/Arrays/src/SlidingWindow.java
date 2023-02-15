public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int window = 2;
        movingWindow(arr, window);
    }

    private static void movingWindow(int[] arr, int window) {
        for (int i = 0; i <= arr.length - window; i++) {
            for (int j = i; j < i + window; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    private static void slidingWindow(int[] arr, int window) {
        
    }
}
