#include<iostream>
#include <algorithm>

bool comp(int a, int b) {
    return a < b;
}

int main() {
    std::cout << "Min: " << std::max({6969, 6, 9, 69, 690}, comp) << "\n";
}