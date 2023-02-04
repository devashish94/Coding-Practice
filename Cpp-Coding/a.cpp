#include <bits/stdc++.h>
using namespace std;

void solve() {
    char c; cin >> c;
    string s = "codeforces";
    for (int i = 0; i < s.size(); i++) {
        if (s[i] == c) {
            cout << "YES\n";
            return;
        }
    }
    cout << "NO\n";
}

int main() {
    int t; cin >> t;
    while (t--) solve();
}
