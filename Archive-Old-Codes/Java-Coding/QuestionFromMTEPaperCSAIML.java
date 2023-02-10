import java.util.Arrays;

public class QuestionFromMTEPaperCSAIML {
    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void debug(int left, int temp_left, int up) {
        System.out.println("Up = " + up + " left = " + left + " temp_left = " + temp_left);
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 1, 1, 1, 1, 0},
            {0, 0, 0, 0, 1, 1, 0},
            {1, 1, 0, 0, 1, 1, 0},
            {1, 1, 0, 0, 0, 1, 0},
            {1, 1, 1, 1, 0, 1, 0}
        };
        print(arr);
        System.out.println();
        fireInForest(arr, 3, 4);
        System.out.println();
        print(arr);
    }
    public static void fireInForest(int[][] arr, int x, int y) {
        edit(arr, x, y);
    }
    public static void edit(int[][] arr, int x, int y) {
        //1. going up algorithm logic below
        //go to the extreme left possible continuously on 0

        //make all the continuous 0's on the right 2, including the current index

        //go up and repeat


        //2. going down algorithm below
        //go to the extreme right possible continuously on 0

        //make all the continuous 0's on the left 2, including the current index

        //go down and repeat

        //going up algorithm logic below
        int left = y;
        int temp_left = left;
        int up = x + 1;

        debug(left, temp_left, up); //debugging

        while (up > 0) {

            debug(left, temp_left, up); //debugging

//            ArrayList<Integer> poss = new ArrayList<>();

            //go to the extreme left possible continuously on 0
            while (left > 0 && arr[up][left] != 1) {
                if (arr[up][left - 1] == 1) break;
                debug(left, temp_left, up); //debugging
                left--;
            }
            temp_left = left;
            debug(left, temp_left, up); //debugging

            //make all the continuous 0's on the right 1, including the current index
            while (temp_left < arr[0].length && arr[up][temp_left] != 1) {
                arr[up][temp_left] = 2;
                if (arr[up][temp_left + 1] == 1) break;
                temp_left++;
                debug(left, temp_left, up); //debugging
            }
            up--; //go up and repeat
        }

        //going down algorithm below
        int right = y;
        int temp_right = right;
        int down = x;

        while (down < arr.length) {
            //go to the extreme right possible continuously on 0
            while (right < arr[0].length && arr[down][right] != 1) {
                if (arr[down][right + 1] == 1) break;
                right++;
            }
            temp_right = right;
            //make all the continuous 0's on the left 2, including the current index
            while (temp_right > 0 && arr[down][temp_right] != 1) {
                arr[down][temp_right] = 2;
                if (arr[down][temp_right - 1] == 1) break;
                temp_right--;
            }
            down++; //go down and repeat
        }
    }
}