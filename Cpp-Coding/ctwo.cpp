#include <bits/stdc++.h>
using namespace std;

int main() {
	int t; cin >> t;
	while (t--) {
	    int a, b, c, d, k; cin >> a >> b >> c >> d >> k;
	    int res = abs(c - a) + abs(d - b);
        if (res > k) {
            cout << "NO\n";
        }
	    else if ((k - res) % 2 == 0) {
	        cout << "YES\n";
	    }
	    else cout << "NO\n";
	}
	return 0;
}
