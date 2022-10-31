#include <iostream>
#define does_this_work ios_base::sync_with_stdio(false);cin.tie(NULL)
#pragma GCC target ("avx2")
#pragma GCC optimization ("O3")
#pragma GCC optimization ("unroll-loops")

using namespace std;

void solve() {
    int n; cin >> n;
    int start = 0, end = n - 1;
    int input[n];
    for (int i = 0; i < n; i++) {
        cin >> input[i];
    }
    for (int i = 0; start <= end && i < n;) {
        if (i % 2 == 0) {
            cout << input[start] << " ";
            i++;
            start++;
        } else {
            cout << input[end] << " ";
            i++;
            end--;
        }
    }
    cout << "\n";
}

int main() {
    does_this_work;
    int t; cin >> t;
    while (t--) {
        solve();
    }
}