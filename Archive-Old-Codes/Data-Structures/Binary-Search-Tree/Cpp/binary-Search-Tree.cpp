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

static void inorder(Node* node) {
    if (node == NULL) {
        return;
    }
    inorder(node->left);
    cout << node->data << " ";
    inorder(node->right);
}

static int bfs(Node* node) {
    if (node == NULL) return 0;
    queue<Node*> q;
    q.push(node);
    int c = 0;
    while(!q.empty()) {
        int count = q.size();   
        while (count --> 0) {
            Node* t = q.front();
            cout << t->data << "\t";
            q.pop();
            if (t->left != NULL) q.push(t->left);
            if (t->right != NULL) q.push(t->right);
        }
        c++;
        cout << "\n";
    }
    return c;
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

static Node* inorderSuccessor(Node* node, int val) {
    Node* successor = node;
    while (node != NULL) {
        if (val >= node->data) {
            node = node->right;
        } else if (val < node->data) {
            successor = node;
            node = node->left;
        }
    }
    return successor;
}

static Node* minValue(Node* node) {
    while (node && node->left != nullptr) {
        node = node->left;
    }
    return node;
}

static Node* deleter(Node* node, int val) {
    if (node == nullptr) {
        return nullptr;
    } else if (val > node->data) {
        node->right = deleter(node->right, val);
    } else if (val < node->data) {
        node->left = deleter(node->left, val);
    } else {
        if (node->left == nullptr && node->right != nullptr) {
            Node* temp = node->right;
            delete node;
            node = nullptr;
            return temp;
        } else if (node->left != nullptr && node->right == nullptr) {
            Node* temp = node->left;
            delete node;
            node = nullptr;
            return temp;
        } else if (node->left == nullptr && node->right == nullptr) {
            return nullptr;
        } else {
            int minV = minValue(node->right)->data;
            node->data = minV;
            node->right = deleter(node->right, minV);
            return node;
        }
    }
    return node;
}

int main() {
    Node* root = NULL;
    vector<int> arr = {3, 8, 1, 6, 4, 7, 13, 14, 10};
    for (int i : arr) {
        root = insert(root, i);
    }
    inorder(root); cout << "\n";
    cout << inorderSuccessor(root, 8) -> data << "\n";
    root = deleter(root, 8);
    inorder(root); cout << "\n";
    bfs(root);
}