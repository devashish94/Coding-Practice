#include <iostream>
using namespace std;

class Student {
public:
    int age = 0;
    std::string name = "NA";
    Student(int a, std::string n) {
        age = a;
        name = n;
        cout << "This is the Student Class\n";
    }
};

int main() {
    Student devashish(19, "Devashish");
    cout << devashish.age << " " << devashish.name << "\n";
}
