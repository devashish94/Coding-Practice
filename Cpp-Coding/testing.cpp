#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;
    Node() {
        this->data = 0;
        this->next = nullptr;
    }
    Node(int data) {
        this->data = data;
    }
};

class LinkedList {
    Node* head = nullptr;
    Node* tail = nullptr;
public:
    void add(int data) { // in O(1) because of 'tail'
        Node* node = new Node(data);
        if (head == nullptr && tail == nullptr) {
            tail = node;
            head = node;
            return;
        }
        tail->next = node;
        tail = node;
    } 
    void printList() { // in O(n)
        Node* temp = head;
        while (temp != nullptr) {
            cout << temp->data << " ";
            temp = temp->next;
        }
        cout << '\n';
    }
};

int main() {
    LinkedList list;
    for (int i = 1; i <= 5; i++) {
        list.add(i);
    }
    list.printList();
}
