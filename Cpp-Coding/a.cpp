#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("avx2,bmi,bmi2,lzcnt,popcnt")
#include <iostream>
using namespace std;

int c(int change, int& h, int& f, int& t) {
    while (change > 0) {
        if (change >= 100 && h > 0) {
            change -= 100;
            h--;
        } else if (change >= 50 && f > 0) {
            change -= 50;
            f--;
        } else if (change >= 25 && t > 0) {
            change -= 25;
            t--;
        } else {
            break;
        }
    }
    return change;
}

int main() {
    int n; cin >> n;
    int h = 0, f = 0, t = 0;
    while (n--) {
        int note; cin >> note;
        if (note == 25) t++;
        else if (note == 50) f++;
        else h++;
        if (note != 25) {
            int change = note - 25;
            int check = c(change, h, f, t);
            if (check != 0) {
                cout << "NO\n";
                return 0;
            }
        } 
    }
    cout << "YES\n";
}