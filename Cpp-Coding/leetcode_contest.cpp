#include <iostream>
using namespace std;

void solve() {
    int arr[4];
    for (int i = 0; i < 4; i++) {
        cin >> arr[i];
    }
    int count = 0;
    bool flag = false;
    for (int i = 0; i < 4; i++) {
        for (int j = i + 1; j < 4; j++) {
            if (arr[i] == arr[j]) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            flag = false;
            continue;
        }
        count++;
    }
    cout << 4 - count; 
}

int main() {
    solve();
}