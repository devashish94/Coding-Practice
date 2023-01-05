#include <bits/stdc++.h>
using namespace std;
 
void process(string x, string& t) {
	for(char i : x) {
		if (i == '#') {
			if (!t.empty()) {
				t.pop_back();
			} else {
				continue;
			}
			
		} else {
			t += i;
		}
	}
}

bool backspaceCompare(string s, string t) {
	string a = "", b = "";
	process(s, a);
	process(t, b);
	if (a == b) {
		return true;
	}
	return false;
}

int main() {
	cout << backspaceCompare("a#c", "b") << "\n";
}
