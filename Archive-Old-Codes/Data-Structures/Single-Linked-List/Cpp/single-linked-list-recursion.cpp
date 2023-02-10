#include <iostream>
using namespace std;

struct Node {
    int data;
    struct Node* next;

    Node(int val) {
        data = val;
        next = nullptr;
    }
};

int length = 0;

Node* insert(Node* node, int data) {
    if (node == nullptr) {
        length++;
        node = new Node(data);
        return node;
    }
    node->next = insert(node->next, data);
    return node;
}

void show(Node* node) {
    if (node == nullptr) {
        return;
    } 
    cout << node->data << " ";
    show(node->next);
}

void reverseShow(Node* node) {
    if (node == nullptr) {
        return;
    }
    show(node->next);
    cout << node->data << " ";
}

void poplast(Node* node) {
    if (node == nullptr) {
        return;
    }
    else if (node->next->next == nullptr) {
        Node* temp = node->next;
        node->next = nullptr;
        delete temp;
        temp = nullptr;
        return;
    } 
    poplast(node->next);
}

void search(Node* node, int target) {
    if (node == nullptr) {
        cout << "No\n";
        return;
    }
    if (node->data == target) {
        cout << "Yes\n";
        return;
    }
    search(node->next, target);
}

int main() {
    Node* head = nullptr;
    for (int i = 0; i < 10; i++) {
        head = insert(head, i + 1);
    }
    cout << length << " \n";
    show(head); cout << "\n";
    poplast(head);
    show(head); cout << "\n";
    search(head, 10);
}