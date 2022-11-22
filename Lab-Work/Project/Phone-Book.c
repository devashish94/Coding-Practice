#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define NAME_SIZE 48

struct Node {
    long long int number;
    char name[NAME_SIZE];
    struct Node *left, *right;
};

static void printIndividual(struct Node* node) {
    printf("Name:\t%s\n", node->name);
    printf("Number:\t%lld\n\n", node->number);
}

static void inorder(struct Node* node) {
    if (node == NULL) {
        return;
    }
    inorder(node->left);
    printIndividual(node);
    inorder(node->right);
}

static struct Node* newNode(char val[], long long int num) {
    struct Node* node = (struct Node*) malloc (sizeof(struct Node));
    strcpy(node->name, val);
    node->number = num;
    node->left = node->right = NULL;
    return node;
}

static struct Node* insert(struct Node* node, char val[], long long int num) {
    if (node == NULL) {
        node = newNode(val, num);
        return node;
    }
    int result = strcmp(val, node->name);
    if (result > 0) {
        node->right = insert(node->right, val, num);
    } else {
        node->left = insert(node->left, val, num);
    }
    return node;
}

static Node* searchNode(struct Node* node, int val) {
    if (node->data == val) {
        return node;
    }
    if (val > node->data) {
        return searchNode(node->right, val);
    }
    return searchNode(node->left, val);
}


static int inorderSuccessor(struct Node* node, int val) {
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

static void print(struct Node* node) {
    printf("****************************\n\tPhone-Book\n");
    inorder(node);
    printf("****************************\n");
}

static void decoration() {
    printf("Press the respective key for your operation\n");
    printf("1. Show the Phone Book.\n");
    printf("2. Insert into the Phone Book.\n");
    printf("3. Exit\n");
}

int main() {
    struct Node* root = NULL;
    
    char arr[30];
    long long int number = 0;

    while (1) {
        printf("\n");
        decoration();
        printf("Enter your choice: ");
        int choice;
        scanf("%d", &choice);
        switch (choice) {
            case 1: {
                print(root);
                break;

            }
            case 2: {
                char c;
                printf("\nEnter Name [first letter capital]: ");
                scanf("%c", &c);
                scanf("%[^\n]s", arr);
                printf("Enter Phone Number: ");
                scanf("%lld", &number);
                root = insert(root, arr, number);
                printf("\n");
                break;

            }
            case 3:
                printf("Bye!!\n");
                return 0;
            default: {
                printf("Invalid Number\n");
            }
        }
    }
}   
