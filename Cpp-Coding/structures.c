#include <stdio.h>

typedef struct person {
    int age;
    float marks;
} person;
x
void main() {
    person one;
    person* ptr = &one;
    one.marks = 10.0f;
    printf("%.1f\n", (*ptr).marks);
}
