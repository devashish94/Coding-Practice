#include <iostream>

int main() {
    long long int count_a = 0, count_b = 0;
    int n, m, x;
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i < n; i++) { scanf("%d", &x); a[x] = i; }
    scanf("%d", &m);
    int b[m];
    for (int i = 0; i < m; i++) {
        scanf("%d", &b[i]);
        x = a[b[i]];
        count_a += x + 1;
        count_b += n - x;
    }
    printf("%lld %lld\n", count_a, count_b);
}
