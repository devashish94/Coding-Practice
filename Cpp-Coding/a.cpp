#include <iostream>
using namespace std;

int main() {
    int n, coins = 0; cin >> n; 
    int d[] = {100, 20, 10, 5, 1};
    for (int i : d) {
        coins += n / i;
        n %= i;
    }
    cout << coins << "\n";
}
