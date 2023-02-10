public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int[] arr = {10, 70, 14, 11, 28, 90, 42, 94, 36, 1, 97, 96, 45, 86, 3, 9, 79, 93, 91};
        System.out.println("Array Size is " + arr.length);
        for (int it = 0; it < arr.length; it++) {
            System.out.print(arr[it] + " ");
        }
        System.out.println();
        System.out.println("********************* Debugging Starts *********************");
        System.out.println("peak element " + peakIndex(arr));
        System.out.println("********************* Debugging Ends *********************");
    }
    public static int peakIndex(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {

            //Defining the mid variable
            int mid = low + (high - low) / 2;

            //Debugging
            for (int it = low; it <= high; it++) {
                System.out.print(arr[it] + " ");
            }
            System.out.println();
            System.out.println("Element at mid is: " + arr[mid]);
            System.out.println("low = " + low + " ; mid = " + mid + " ; high = " + high);

            //Peak Element Logic Starts here
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
                System.out.printf("high = mid - 1 ==> high = %d - 1 ==> high = %d\n", mid, high);
                System.out.println("------------------------------------------------------------------------");
            }
            else if (mid < arr.length - 1 && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
                System.out.printf("low = mid + 1 ==> low = %d + 1 ==> low = %d\n", mid, low);
                System.out.println("------------------------------------------------------------------------");

            }
            else {
                System.out.println("------------------------------------------------------------------------");
                return arr[mid];
            }
        }
        return -1;
    }
}
