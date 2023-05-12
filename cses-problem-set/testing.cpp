#include <iostream>

int main() {
    long long n; 
    std::cin >> n;
    while (n > 1) {
        if (n % 2 == 0) {
            std::cout << n << " ";
            n /= 2;
        } else {
            std::cout << n << " ";
            n = 3 * n + 1;
        }
    }
    std::cout << n << '\n';
}
