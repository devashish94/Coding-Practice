#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int findDuplicate(vector<int>& arr) {
        vector<int> a(arr.size() + 1, 0);
        int x;
        for (int i = 0; i < arr.size(); i++) {
            a[arr[i]]++;
            if(a[arr[i]] > 1) {
                x = arr[i];
                break;
            }
        }
        return x;
    }
};

int main() {
    vector<int> arr = {1,3,4,2,2};
    Solution solution;
    cout << solution.findDuplicate(arr) << "\n";
}