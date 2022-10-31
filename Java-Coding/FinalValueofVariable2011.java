public class FinalValueofVariable2011 {
    public static void main(String[] args) {
        String[] x = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(x));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--X") || operations[i].equals("X--")) {
                sum--;
            }
            else {
                sum++;
            }
        }
        return sum;
    }
}
