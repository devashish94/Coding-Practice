#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n; cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) cin >> arr[i];
    for (int k = 1; k < n; k++) {
        int lp = 1, rp = 1;
        for (int i = 0; i < n; i++) {
            if (i < k) lp *= arr[i];
            else rp *= arr[i];
        }
        if (lp == rp) {
            cout << k << "\n";
            return;
        }
    }
    cout << "-1\n";
}

int main() {
    int t; cin >> t;
    while (t--) solve();
}
