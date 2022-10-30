#include <iostream>
using namespace std;

int add_to_n(int n) {
    if (n == 0) {
        return 0;
    }
    return n + add_to_n(n - 1);
}

int multiply(int a, int b) {
    if (b == 0) {
        return 0;
    }
    return a + multiply(a, b - 1);
}

int factorial(int n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

int power(int a, int b) {
    if (b == 0) {
        return 1;
    }
    return a * power(a, b - 1);
}

int sum_of_digits(int n) {
    if (n == 0) {
        return 0;
    }
    return (n % 10) + sum_of_digits(n / 10);
}

int prod_of_digits(int n) {
    if (n % 10 == n) {
        return n;
    }
    return (n % 10) * prod_of_digits(n / 10);
}

int fn = 0;
void reverse_number(int n) {
    if (n == 0) {
        return;
    }
    fn = fn * 10 + n % 10;
    reverse_number(n / 10);
}

int countZeros(int n, int count) {
    if (n == 0) {
        return count;
    }
    if (n % 10 == 0) {
        return countZeros(n / 10, count + 1);
    } 
    return countZeros(n / 10, count);
}

int coding(int n) {
    if (n == 0) {
        return 0;
    }
    if (n % 2 == 0) {
        return 1 + coding(n / 2);
    }
    return 1 + coding (n -1);
}

int main() {
    cout << coding(8) << "\n";
}