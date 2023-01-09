#include <iostream>
using namespace std;

int main() {
    for (int i = 0; i < 10; i++) {
        cout << "writing this from linux: ";
        int* p = &i;
        cout << p << "\n";
    }
}
