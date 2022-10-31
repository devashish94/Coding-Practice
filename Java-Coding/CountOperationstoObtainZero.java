public class CountOperationstoObtainZero {
    public static void main(String[] args) {
        System.out.println(countOperations(0, 0));
    }
    public static int countOperations(int num1, int num2) {
        int count = 0;
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        while (num1 != 0 || num2 != 0) {
            if (num1 >= num2) {
                num1 = num1 - num2;
                if (num1 == 0 || num2 == 0) {
                    break;
                }
            }
            else {
                num2  = num2 - num1;
                if (num1 == 0 || num2 == 0) {
                    break;
                }
            }
            System.out.println(num1 + " " + num2);
            count++;
        }
        return count + 1;
    }
}

