#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n, x = 0, y = 0; cin >> n;
    string s; cin >> s;
    for (int i = 0; i < n; i++) {
        if (s[i] == 'L') x--;
        else if (s[i] == 'U') y++;
        else if (s[i] == 'D') y--;
        else if (s[i] == 'R') x++;
        if (x == 1 && y == 1) { cout << "YES\n"; return; }
    }
    cout << "NO\n";
}

int main() { 
    int t; cin >> t;
    while (t--) solve();
}
