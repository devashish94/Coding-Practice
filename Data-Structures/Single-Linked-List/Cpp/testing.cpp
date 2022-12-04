#include<iostream>

void show() {
    static int a = 0;
    if (a == 10) {
        return;
    }
    a++;
    std::cout << a << " ";
    show();
}

int main() {
    show();
    std::cout << "\n";
}