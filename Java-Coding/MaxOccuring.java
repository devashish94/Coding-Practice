public class MaxOccuring {
    public static void main(String[] args) {
        double[] arr = {0.5, -1.0, -1.0, -1.0};
        System.out.println(x(arr));
    }
    public static int x(double[] arr) {
        int count = 0, temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    if (count > temp) {
                        temp = count;
                    }
                }
            }
        }
        return temp;
    }
}
