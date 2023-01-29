#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n, k = 3; cin >> n;
    int arr[n];
    vector<int> m(n + 1, -1);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
        m[arr[i]] = i;
    }   
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
            int value = arr[i] + arr[j];
            if (m[value] != -1) {
		cout << "hello world\n";
            }
        }
    }
    cout << "NO\n";
}

int main() {
    int t; cin >> t;
    while (t--) solve();
}
