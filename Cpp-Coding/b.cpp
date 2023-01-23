#include <iostream>
#include <unordered_map>

int b[100000], n, m, x;
long long int count_a = 0, count_b = 0;
std::unordered_map<int, int> map;

int main() {
    std::cin >> n;
    for (int i = 0; i < n; i++) { std::cin >> x; map[x] = i; }
    std::cin >> m;
    for (int i = 0; i < m; i++) {
        std::cin >> b[i];
        x = map[b[i]];
        count_a += x + 1;
        count_b += n - x;
    }
    std::cout << count_a << " " << count_b << "\n";
}