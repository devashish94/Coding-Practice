#include <bits/stdc++.h>
using namespace std;

int gcd(int a, int b) {
    int result = min(a, b);
    while (result > 0) {
        if (a % result == 0 && b % result == 0) break;
        result--;
    }
    return result;
}

void solve() {
    int n, ms = -1; cin >> n;
    vector<int> arr(n, 0); 
    for (int i = 0; i < n; i++) cin >> arr[i];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            int sum = i + j;
            if (gcd(arr[i], arr[j]) == 1) {
                if (sum > ms) ms = sum;
            }
        }
    }
    cout << "sum = " << ms << endl;
}

int main() {
    int t; cin >> t;
    while (t--) {
        solve();
    }
}