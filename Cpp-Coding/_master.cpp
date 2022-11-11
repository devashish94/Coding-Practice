#include <bits/stdc++.h>
using namespace std;

int main() {
	int n; cin >> n;
	string s; cin >> s;
	
	map<string, int> m;
	
	for (int i = 0; i < n - 1; i++) {
		string t = "";
		t += s[i]; t += s[i + 1];
		m[t]++;
	}
	
	int max_value = -1;
	string key = "";
	for (auto i : m ) {
		if (i.second > max_value) {
			key = i.first;
			max_value = i.second;
		}
	}
	cout << key << "\n";
}
