#include <iostream>
#include <utility>
#include <vector>
#define does_this_work ios_base::sync_with_stdio(false);cin.tie(NULL)
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("avx2,tune=native")

using namespace std;

void solve() {
	int n; cin >> n;
	int a = 0, b = (3 * n) - 1, count = 0;
	vector<pair<int, int>> arr;
	for (; a < b;) {
		arr.push_back(make_pair(a + 1, b + 1));
		a += 3; b -= 3;
		count++;
	}
	cout << count << "\n";
	for (auto i : arr) {
		cout << i.first << " " << i.second << "\n";
	}
}

int main() {
    does_this_work;
    int t; cin >> t;
	while (t--) {
		solve();
	}
}
