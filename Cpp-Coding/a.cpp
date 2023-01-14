#include <bits/stdc++.h>
using namespace std;

long long power(int N,int R) {
    long long ans = 1;
    for (int i = 1; i <= R; i++) {
        ans  = ans * (N % 1000000007);
    }
    return ans % 1000000007;
    // This was not that easy of a question
}

int main() {
    long long n, r; cin >> n >> r;
    cout << power(n, r) << "\n";
}
