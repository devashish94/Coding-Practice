#include <bits/stdc++.h>
using namespace std;

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    for (int i = 0; i < 3; i++) {
        for (int j = i; j < i + 3; j++) {
            cout << arr[j] << " ";
        }
        cout << "\n";
    }    
}
