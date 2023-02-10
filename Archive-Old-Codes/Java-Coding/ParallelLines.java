import java.util.Arrays;


public class ParallelLines {
    public static void main(String[] args) {
        // int[][] arr = {{1, 1}, {2, 2}, {3, 3}, {1, 2}};
        int[][] arr = {{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};

        System.out.print("The given coordinates are: " );
        for (int i = 0; i < arr.length; i++)
            System.out.print(Arrays.toString(arr[i]) + " ");
        System.out.println();
        System.out.println();

        double slope = 1.2;
        int combinations = pNc(arr), counter = 0;
        double[] store = new double[combinations]; 

        System.out.println("All pairs of coordinates that are giving a slope are ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j][0] - arr[i][0]) == 0) {
                    slope = 696969;
                    store[counter] = slope;
                    System.out.println(Arrays.toString(arr[i]) + " X " + Arrays.toString(arr[j]) + " Slope = " + slope);
                    counter++;
                    continue;
                }
                
                slope = ((double)(arr[j][1] - arr[i][1])/(double)(arr[j][0] - arr[i][0]));

                store[counter] = slope;
                counter++;
                System.out.println(Arrays.toString(arr[i]) + " X " + Arrays.toString(arr[j]) + " Slope = " + slope);
                // System.out.print(slope + "\t");
            }
        }
        System.out.println();
        System.out.println("ALL slopes stored are: "+ Arrays.toString(store));
        System.out.println("Maximum points that are forming a line are = " + maxRepeat(store));
    }

    public static int pNc(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                count++;
            }
        }
        return count;
    }

    public static int maxRepeat(double[] arr) {
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
