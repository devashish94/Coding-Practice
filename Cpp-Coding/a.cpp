#include <iostream>
using namespace std;

void solve() {
    int n, k; cin >> n >> k;
    if (k == 0) {
        cout << n << "\n";
    }
    cout << n % k << "\n";
}

int main() {
    int t; cin >> t;
    while (t--) {
        solve();
    }
}