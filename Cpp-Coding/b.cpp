#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n, s, r; cin >> n >> s >> r;
    cout << s - r << " ";
    n--;
    if (r % n == 0) {
        int x = r / n;
        while (n--) cout << x << " "; 
        cout << "\n";
    } else {
        int less = ceil((float) r / (float) n), save = n;
        while (n-- > 1) cout << less << " ";
        cout << r - ((save - 1) * less) << "\n";
    }
}

int main() { 
    int t; cin >> t;
    while (t--) solve();
}

// FAILED AT 5 9 6