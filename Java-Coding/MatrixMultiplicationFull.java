import java.util.Scanner;

public class MatrixMultiplicationFull {
    static {
        System.out.println("************ Matrix Multiplication Program Starts from here ************");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the row and column of the First Matrix respectively: ");
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        System.out.print("What is the row and column of the Second Matrix respectively: ");
        int r2 = in.nextInt();
        int c2 = in.nextInt();

        //Condition to check if the multiplication of the two matrices is possible
        if (c1 != r2) {
            System.out.println("The Matrix with the given row and column sizes cannot be Multiplied");
            return;
        }

        //Taking input of all the elements of the First matrix
        int[][] m1 = new int[r1][c1];
        System.out.println("Now enter the Elements of the First Matrix one by one");
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.printf("Element at (%d, %d): ", i, j);
                m1[i][j] = in.nextInt();
            }
        }
        //Printing the whole First Matrix
        System.out.println("The First Matrix is ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------");

        //Taking input of all the elements of the Second matrix
        int[][] m2 = new int[r2][c2];
        System.out.println("Now enter the Elements of the Second Matrix one by one");
        for(int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.printf("Element at (%d, %d): ", i, j);
                m2[i][j] = in.nextInt();
            }
        }
        //Printing the whole Second Matrix
        System.out.println("The Second Matrix is ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(m2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------");

        //Declaring the Answer Matrix
        int[][] answer = new int[c1][r2];

        //Main Multiplication Logic
        for (int k = 0; k < r1; k++) {
            for (int j = 0; j < c2; j++) {
                for (int i = 0; i < r2; i++) {
                    answer[k][j] += m1[k][i] * m2[i][j];
                }
            }
        }



        //Printing the Answer Matrix
        System.out.println("The Multiplication between the First Matrix and the Second Matrix yields the following Matrix as the result");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(answer[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("************************ End of the Program ************************");
    }
}
