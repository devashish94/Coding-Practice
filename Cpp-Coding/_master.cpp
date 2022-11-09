#include <bits/stdc++.h>
using namespace std;

int main() {
    int t; cin >> t;
	while (t--) {
		int n; cin >> n;
		vector<int> arr(n);
		for (int i = 0; i < n; i++) {
			cin >> arr[i];
		}
		unordered_map<int, int> m;
		for (int i = 0; i < n; i++) {
			m[arr[i]]++;
		}
		for (auto i : m) {
			if (i.second >= 3) {
				cout << i.first << "\n";
				return 0;
			}
		}
		cout << -1 << "\n";
	}
}
