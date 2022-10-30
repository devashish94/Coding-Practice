#include <bits/stdc++.h>
#define pr(arr) for(int x = 0; x < arr.size(); x++) cout << arr[x] << " "; cout << "\n";

using namespace std;
int maxEl(vector<int>& arr, int n) {
    int max = 0; for (int i = 0; i < n; i++) if (arr[i] > max) max = arr[i]; return max;
}


/*  1. Start from the end, if 2*N number is available. then put it inside array
            and make it max. Now for the rest k - 1 operations do the following:
                a) starting from the leftmost location, put all of'em inside the array
                b) calculate the score, and then score sum
    2. If 2*N not available. starting from the leftmost location, put all of'em inside the array.
    3. calculate the score, and then score sum.
*/

// FATAL ERROR, CODE IS SHOWING WRONG OUTPUT "DEBUG" CORRECT IT AS SOON AS POSSIBLE
// missing functionality. HANDLE THE CASE WHEN K == 1

int main() {
    int t; cin >> t;
    while(t--) {
        int n, k; cin >> n >> k;
        vector<int> arr(n); int q;
        // input the array
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        // pr(arr);
        
        int max = maxEl(arr, n); 
        int sum = 0;
        //check for 2*N number available to fill in
        bool check_max = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2 * n) {
                check_max = true;
            }
        }

        if (check_max == true) { 
            // starting from the leftmost location, put all of'em inside the array, if distinct.
            for (int i = 1; i < 2 * n && k != 0; i++) {
                if (k != 0) {
                    bool check_for_distinik = false;
                    for (int j = 0; j < arr.size(); j++) {
                        if (i == arr[j]) {
                            check_for_distinik = true; break;
                        }
                    }
                    if (check_for_distinik == true) continue;
                    arr.push_back(i);
                    // pr(arr);
                    sum += max - i;
                }
                k--;
            }
        }

        else { // means 2 * N is available to put inside the array
            arr.push_back(2 * n);
            // pr(arr);
            k--;
            max = 2 * n; // updating the max element in the array
            // starting from the leftmost number, push it inside the array if distinct
            for (int i = 1; i < 2 * n && k != 0; i++) {
                if (k != 0) {
                    bool check_for_distinik = false;
                    for (int j = 0; j < arr.size(); j++) {
                        if (i == arr[j]) {
                            check_for_distinik = true; break;
                        }
                    }
                    if (check_for_distinik == true) continue;
                    arr.push_back(i);
                    // pr(arr);
                    sum += max - i;
                }
                k--;
            }
        }
        cout << sum << "\n";
    }
}
