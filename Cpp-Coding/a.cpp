#include <iostream>
using namespace std;

int main() {
    int t, n, m; cin >> t;
    while (t--) {
        cin >> n >> m;
        if ((n == 2 && m == 3) || (n == 3 && m == 3) || (n == 3 && m == 2)) {
            cout << "2 2\n";
        } else {
            cout << "1 1\n";
        }
    }
}
