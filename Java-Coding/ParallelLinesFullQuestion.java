import java.util.*;
class ParallelLinesFullQuestion {
    public static void main(String[] args) {
        int[][] arr = {{2, 3}, {3, 3}, {-5, 3}};
        System.out.println(maxPoints(arr));
    }
    public static int maxPoints(int[][] points) {   
        if(points.length<=2)
                return points.length;
            int answer = 5;
            double slope;
            int counter_tenor = 0;
            double[] slopesss;
            int[] final_values = new int[points.length];
            for (int i = 0; i < points.length - 1; i++) {
                slopesss = new double[points.length - i - 1];
                for (int j = i + 1; j < points.length; j++) {
                    if ((double)points[j][0]-(double)points[i][0] == 0) {
                        slope = 69.69;
                        slopesss[counter_tenor] = slope;
                        counter_tenor++;
                        System.out.println(Arrays.toString(points[i]) + " x " + Arrays.toString(points[j]) + "\tslope =\t" + slope);
                        continue;
                    }
                    if ((double)points[j][1]-(double)points[i][1] == 0) {
                        slope = 0;
                        slopesss[counter_tenor] = slope;
                        counter_tenor++;
                        System.out.println(Arrays.toString(points[i]) + " x " + Arrays.toString(points[j]) + "\tslope =\t" + slope);
                        continue;
                    }
                    slope = (((double)points[j][1]-(double)points[i][1])/((double)points[j][0]-(double)points[i][0]));
                    slopesss[counter_tenor] = slope;
                    counter_tenor++;
                    System.out.println(Arrays.toString(points[i]) + " x " + Arrays.toString(points[j]) + "\tslope =\t" + slope);
                }
                // answer = calculateMax(slopesss);
                final_values[i] = calculateMax(slopesss);
                counter_tenor = 0;
                System.out.println(Arrays.toString(slopesss));
            }
            answer = maximumFinalValue(final_values);
            return Math.max(answer+1,2);
        }
    
        public static int combinations(int[][] points) { //this function calculates the total number of combinations of points available without arrangement
            int count = 0;
            for (int i = 0; i < points.length - 1; i++) {
                for (int j = i + 1; j < points.length; j++) {
                    count++; 
                }
            }
            return count;
        }
    
        public static int calculateMax(double[] arr) { //this function calculates the highest number of repeated slope in the array
            int count = 0, temp = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if ((Double.compare(arr[i], arr[j]) == 0)) {
                        count++;
                        if (count > temp) {
                            temp = count;
                        }
                    }
                }
            }
            return temp; 
        }
    
        public static int maximumFinalValue(int[] nums) {
            int max = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            return max;
        } 
    }