#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m, count = 0; cin >> n >> m;
    if (m < n) {
        cout << n - m;
    }
    else if (m < 2 * n) {
        while (2 * n > m) {
            n--; count++;
        }
        if (2 * n == m) {
            cout << count + 1;
        } else if (2 * n > m) {
            cout << count + 2
        }
    }
}