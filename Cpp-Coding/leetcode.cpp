#include <iostream>
#include <vector>
#include <utility>
#include <stack>
using namespace std;

string removeDuplicates(string s) {
	stack<char> a;
	for (int i = 0; i < s.size();) {
		if (s[i] != s[i + 1]) {
			if (s[i] == a.top()) {
				a.pop();
				i++;
			} else {
				a.push(s[i]);
			}
		} else {
			i += 2;
		}
	}
}
int main() {
    string s = "abbaca";
	cout << removeDuplicates(s) << "\n";
}
