public class TableOfTwoUsingDifferentIteratorStatements {
    public static void main(String[] args) {
        //for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + "\t=\t" + 2 * i);
        }

        System.out.println("------------------------------");

        //while loop
        int j = 1;
        while (j != 11) {
            System.out.println("2 x " + j + "\t=\t" + 2 * j);
            j++;
        }

        System.out.println("------------------------------");

        //do-while loop
        int k = 1;
        do {
            System.out.println("2 x " + k + "\t=\t" + 2 * k);
            k++;
        } while (k < 11);

    }
}
