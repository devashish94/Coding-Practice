#include <bits/stdc++.h>
using namespace std;

void printer(vector<vector<int>> arr) {
    for (auto i : arr) {
        for (auto j : i) {
            cout << j << " ";
        }
        cout << "\n";
    }
}

int main() {
    vector<vector<int>> arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int row = 0, col = 0, count = arr.size() * arr[0].size(), w = arr[0].size(), h = arr.size();
    while (count--) {
        if (row < h && col < w / 2) {
            col++;
        } else if (row < h / 2 && col >= w / 2 && col < w) {
            col++;
        } else if (row < h / 2 && col > w / 2) {
            row++;
        } else if (row >= h / 2 && row < h && col > w / 2) {
            row++;
        } else if (row >= h / 2 && )
    }
}
