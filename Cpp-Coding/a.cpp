#include <bits/stdc++.h>
using namespace std;

int negative(vector<int>& arr) {
    int left = 0, right = arr.size() - 1, neg = -1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] < 0) {
            neg = mid;
            left = mid + 1;
        } else {
            right = mid - 1;    
        }
    }    
    if (neg == -1) return -1;
    return neg + 1;
}

int positive(vector<int>& arr) {
    int left = 0, right = arr.size() - 1, t = -1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] <= 0) {
            left = mid + 1;
        } else {
            t = mid;
            right = mid - 1;
        }
    }
    if (t == -1) return -1;
    return arr.size() - t;
}

int maximumCount(vector<int>& arr) {
    int pos = positive(arr), neg = negative(arr);  
    if (pos == neg && pos == -1) {
        return 0;
    }
    return max(pos, neg);
}

int main() {
    vector<int> arr = {5,20,66,1314};
    cout << "Answer: " << maximumCount(arr) << "\n";
}
