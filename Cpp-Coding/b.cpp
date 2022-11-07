#include <bits/stdc++.h>
using namespace std;

int main() {
    string s = "";
    s.push_back('a');
    s += "s";
    s.pop_back();
    s.pop_back();
    cout << !s.empty() << "\n";
    cout << s << "\n";
}