#include <iostream>
#define does_this_work ios_base::sync_with_stdio(false);cin.tie(NULL)
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("avx2,tune=native")

using namespace std;

void solve() {
	int n; cin >> n;
	for (int i = 0; i < n; i++) {
		cout << 69 << " ";
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
