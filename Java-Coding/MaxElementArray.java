public class MaxElementArray {
    public static void main(String[] args) {
        float[] arr = {2, 4, 5, 3, 5, 1, 1, 3, 1};
        System.out.println("Max Repeats are: " + maxRepeat(arr));
    }
    public static int maxRepeat(float[] arr) {
        int count, currentMax = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count += 1;
                    if (count > currentMax) {
                        currentMax = count;
                    }
                }
            }
        }
        return currentMax;
    }
}