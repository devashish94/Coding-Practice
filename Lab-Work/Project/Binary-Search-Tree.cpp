#include <iostream>
#include <vector>
using namespace std;

struct Node {
    int data;
    struct Node *left, *right;
    Node(int val) {
        data = val;
        left = NULL;
        right = NULL;
    }
};

static void inorder(Node* node) {
    if (node == NULL) {
        return;
    }
    inorder(node->left);
    cout << node->data << " ";
    inorder(node->right);
}

static struct Node* insert(Node* node, int val) {
    if (node == NULL) {
        node = new Node(val);
        return node;
    }
    if (val > node->data) {
        node->right = insert(node->right, val); 
    } else {
        node->left = insert(node->left, val);
    } 
    return node;
}

int main() {
    Node* root = NULL;
    vector<int> arr = {50, 15, 62, 5, 20, 58, 91, 3, 8, 37, 60, 24};
    for (int i : arr) {
        root = insert(root, i);
    }
    inorder(root);
    cout << "\n";
}