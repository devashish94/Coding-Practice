#include <iostream>
using namespace std;

void solve(int n) {
    if (n < 1) {
        return;
    }
    solve(n - 1);
    cout << n << "\n";
}

int main() {
    int n = 10;
    solve(n); 
}