public class PrimeNumbers {
    public static void main(String[] args) {
        //Print all the prime numbers from 1 to 100 also their count
        int countPrimes = 0;
        for (int i = 0; i < 100; i++) {
            if (primeCheck(i) == 1) {
                countPrimes++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("The number of prime numbers are " + countPrimes);
    }
    public static int primeCheck(int a) {
        if (a == 1 || a == 0) {
            return 0;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
