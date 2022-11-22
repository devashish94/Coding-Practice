#include<bits/stdc++.h>
using namespace std;

int main() {
    int t; cin >> t;
    while (t --> 0) {
        int n; cin >> n;
        vector<int> arr(n);
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        
        // finding the first max
        int maxIndex = -1, max = *max_element(arr.begin(), arr.end());
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                maxIndex = i;
                arr[i] = -1;
                break;
            }
        } 

        // finding the second max
        int sMaxIndex = -1, smax = *max_element(arr.begin(), arr.end());
        for (int i = 0; i < n; i++) {
            if (arr[i] == smax) {
                sMaxIndex = i;
                break;
            }
        } 
        arr[maxIndex] = max;

        // iterate over each element and use the max to subtract values but at max, use the smax value
        for (int i : arr) {
            if (i != max) {
                cout << i - max << " ";
            } else {
                cout << i - smax << " ";
            }
        } 
        cout << "\n";
    }
}