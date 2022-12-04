import java.util.Scanner;

class IDE {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int m = read.nextInt(), c = read.nextInt(), sum = 0;
        int[] arr = new int[m];

        for (int i : arr) {
            i = read.nextInt();
            sum += i;
        }

        if (sum > c) {
            System.out.println("Not Possible");
        } else {
            System.out.println("Possible");
        }
    }
}

/* C++ Code
*
* #include <iostream>
* using namespace std;
*
* int main() {
*   int m, c, sum = 0; cin >> m >> c;
*   int arr[m];
*   for (int i : arr) {
*      cin >> i; sum += i;
*   }
*   if (sum > c) cout << "Not Possible\n";
*   else cout << "Possible\n";
* }
*
* */
