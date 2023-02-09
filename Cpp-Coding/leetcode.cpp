#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& arr, int target) {
        vector<int> answer = {0, 0};
        unordered_map<int, int> m;
        for (int i = 0; i < arr.size(); i++) {
            int otherValue = target - arr[i];
            if (m.find(otherValue) != m.end()) {
                answer[0] = i;
                answer[1] = m[otherValue];
                return answer;
            }
            m[arr[i]] = i;
        }
        return answer;
    }
};

int main() {
	Solution solution;
    vector<int> arr = {3, 2, 4}, ans;
    int target = 6;
    ans = solution.twoSum(arr, target);
    for (auto i : ans) {
        cout << i << " ";
    }
    cout << "\n";
}
