public class MatrixMultiplication3X3 {
    public static void main(String[] args) {
        //Initialization of Variables and Arrays
        int[][] first = {{12, 8, 4}, {3, 17, 14}, {9, 8, 10}};
        int[][] second = {{5, 19, 3}, {6, 15, 9}, {7, 8, 16}};
        int[][] ans = new int[3][3];
        int sum = 0;

        //Main Multiplication Logic
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                sum = 0;
                for (int i = 0; i < 3; i++) {
                    sum += first[k][i] * second[i][j];
                    System.out.println(first[k][i]  + " * " + second[i][j] + " = " + first[k][i] * second[i][j]);
                }
                ans[k][j] = sum;
                System.out.println("sum = " + sum);
                System.out.println("----------------------------");
            }
        }

        //Decoration
        System.out.println("The Answer 2D Array is ");

        //Printing the Final Multiplied Array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ans[i][j] + "\t");
            }
            if (i == 2) break;
            System.out.println();
        }
    }
}
