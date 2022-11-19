#include <bits/stdc++.h>
using namespace std;

int main() {
	int t; cin >> t; 
	while (t--) {
		vector<int> arr(3);
		cin >> arr[0] >> arr[1] >> arr[2];
		sort(arr.begin(), arr.end());
		
		if (arr[2] == arr[1] && arr[0] % 2 == 1) {
			cout << "NO\n";
		} else if (arr[2] == arr[1] && arr[0] % 2 == 0) {
			cout << "YES\n";
		}
		else if (arr[0] == arr[1] && arr[2] % 2 == 1) {
			cout << "NO\n";
		} else if (arr[0] == arr[1] && arr[2] % 2 == 0) {
			cout << "YES\n";
		}
		else if (arr[2] - arr[1] != arr[0] && arr[2] - arr[0] != arr[1]) {
			cout << "NO\n";
		} else {
			cout << "YES\n";
		}
	}
}
