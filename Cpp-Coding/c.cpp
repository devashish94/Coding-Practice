#include <iostream>
#include <unordered_set>
using namespace std;

void solve() {
    int n, max = -1; cin >> n;
    string s; cin >> s;
    
    bool check = false;
    for (int i = 0; i < n; i++) if (s[0] != s[i]) check = true;
    if (!check) {cout << 2 << "\n"; return;}
    
    for (int i = 1; i < n; i++) {
        unordered_set<char> lm, rm;
        for (int l = 0; l < n; l++) {
            if (l < i) lm.insert(s[l]);
            else rm.insert(s[l]);
        }   
        int sum = (int)lm.size() + (int)rm.size();
        if (sum > max) max = sum;
    }
    cout << max << "\n";
}

int main() { 
    int t; cin >> t;
    while (t--) solve();
}
