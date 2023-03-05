#include <bits/stdc++.h>
using namespace std;

int smallS=INT_MAX;

class Solution {
public:
    int minimumTime(vector<vector<int>>& arr) {
        helper(0, 0, 0, arr);
        /*
            {0, 1, 3, 2}, 
            {5, 1, 2, 5}, 
            {4, 3, 8, 6}
            arr.size = 3
            arr[0].size = 4
            s = 0
            i = 0
            j = 0
        */
        return 0;
    }
    bool valid_position(int i, int j, vector<vector<int>>& arr) {
        if(i >= 0 && j >= 0 && i <= arr.size() - 1 && j <= arr[0].size() - 1) {
            return true;
        }
        return false;
    }
    void helper(int s, int i, int j, vector<vector<int>>& arr) {
        if (i == arr.size() - 1 && j == arr[0].size() - 1) {
            if(s < smallS) {
                smallS = min(smallS, s);
                cout << s << " Found \n \n \n  "; 
                return;
            }
            return;
        }
        if (valid_position(i + 1, j, arr) && arr[i + 1][j] <= s + 1) {
            cout << "went down\n";
            helper(s + 1, i + 1, j, arr);
        }
        if (valid_position(i, j + 1, arr) && arr[i][j + 1] <= s + 1) {
            cout << "went right\n";
            helper(s + 1, i, j + 1, arr);
        }
        if (valid_position(i, j - 1, arr) && arr[i][j - 1] <= s + 1) {
            cout << "went left\n";
            helper(s + 1, i, j - 1, arr);
        }
        if (valid_position(i - 1, j, arr) && arr[i - 1][j] <= s + 1) {
            cout << "went up\n";
            helper(s + 1, i - 1, j, arr);
        } 
    }
};

int main() {
    vector<vector<int>> arr = {{0, 1, 3, 2}, {5, 1, 2, 5}, {4, 3, 8, 6}};
    Solution solution;
    cout << solution.minimumTime(arr) << '\n';
}