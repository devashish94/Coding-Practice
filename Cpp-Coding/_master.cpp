#include <iostream>
#include <stack>
#define does_this_work ios_base::sync_with_stdio(false);cin.tie(NULL)
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("avx2,tune=native")

using namespace std;

int convert(string);
void solve() {
	string s = "-124";
	cout << convert(s) << "\n";
}

int convert(string s) {
	int n = 0;
	for (int i = 1; i < s.size(); i++) {
		n = 10 * n + (s[i] - '0');
	}
	return n;
}

int main() {
    does_this_work;
    int t; cin >> t;
	while (t--) {
		solve();
	}
}
