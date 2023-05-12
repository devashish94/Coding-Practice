#include <iostream>

int main() {
    int64_t n; 
    std::cin >> n;
    int arr[n - 1];
    for (int i = 0; i < n - 1; i++) {
        std::cin >> arr[i];
    }
    int64_t mathSum = !(n & 1) ? (n + 1) * (n >> 1) : n * ((n + 1) >> 1);
    int64_t arraySum = 0;
    for (int i = 0; i < n - 1; i++) {
        arraySum += arr[i];
    }
    std::cout << mathSum - arraySum << '\n';
}
