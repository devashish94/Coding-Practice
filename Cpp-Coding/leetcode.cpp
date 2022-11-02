#include <iostream>
#include <vector>
using namespace std;

bool isValid(string s) {
	/* Main logic
		1. iterate over the string
		2. if current element is a opening bracket, then push to stack
		3. if current element is a closing bracket, then compare with stack top.
		4. if (3.) is false, then brackets are not balanced. 
		5. else, pop the top from the stack and move ahead
		6. at the end also check if the stack is empty. otherwise not balanced
	*/
	if (s.size() % 2 != 0) {
		return false;
	}   
	int arr[s.size()];
	int top = -1;
	for (int i = 0; i < s.size(); i++) {
		if (s[i] == '(' || s[i] == '{' || s[i] == '[') {
			top++;
			arr[top] = s[i];
		}
		else if (
			(top == -1) || ((arr[top] != '(' && s[i] == ')') ||  (arr[top] != '{' && s[i] == '}') || (arr[top] != '[' && s[i] == ']'))) {
			return false;
		}
		else {
			top--;
		}
	}
	if (top == -1) {
		return true;
	}
	return false;
}

int main() {
    string s; cin >> s;
	cout << isValid(s) << "\n";
}
