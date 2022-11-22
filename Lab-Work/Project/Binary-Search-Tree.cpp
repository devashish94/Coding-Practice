#include<bits/stdc++.h>
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

// prototypes
static void inorder(Node* node);
static void bfs(Node* node);
static struct Node* insert(Node* node, int val);
static Node* search(Node* node, int val);
static int inorderSuccessor(Node* node, int val);

static void inorder(Node* node) {
    if (node == NULL) {
        return;
    }
    inorder(node->left);
    cout << node->data << " ";
    inorder(node->right);
}

static void bfs(Node* node) {
    if (node == NULL) return;
    queue<Node*> q;
    q.push(node);
    while(!q.empty()) {
        int count = q.size();
        while (count --> 0) {
            Node* t = q.front();
            cout << t->data << "\t";
            q.pop();
            if (t->left != NULL) q.push(t->left);
            if (t->right != NULL) q.push(t->right);
        }
        cout << "\n";
    }
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

static Node* searchNode(Node* node, int val) {
    if (node->data == val) {
        return node;
    }
    if (val > node->data) {
        return searchNode(node->right, val);
    }
    return searchNode(node->left, val);
}

static int inorderSuccessor(Node* node, int val) {
    int successor = node->data;
    while (node != NULL) {
        if (val >= node->data) {
            node = node->right;
        } else if (val < node->data) {
            successor = node->data;
            node = node->left;
        }
    }
    return successor;
}

int main() {
    Node* root = NULL;
    vector<int> arr = {3, 8, 1, 6, 4, 7, 13, 14, 10};
    for (int i : arr) {
        root = insert(root, i);
    }
    inorder(root); cout << "\n";
    int x = inorderSuccessor(root, 10);
    cout << x << " \n";

}