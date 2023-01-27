#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n; cin >> n;
    set<int> s;
    for (int i = 1; i <= n * (n - 1); i++) {
        int x; cin >> x;
        s.insert(x);
    }
    for (auto& str : s) {
        cout << str << " ";
    }
}

int main() { 
    int t; cin >> t;
    while (t--) solve();
}
