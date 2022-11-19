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

static void print(struct Node* node) {
    if (node == NULL) {
        return;
    }
    print(node->left);
    printIndividual(node);
    print(node->right);
}

static struct Node* newNode(char val[], long long int num) {
    struct Node* node = (struct Node*) malloc (sizeof(struct Node));
    strcpy(node->name, val);
    node->number = num;
    node->left = NULL;
    node->right = NULL;
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


int main() {
    struct Node* root = NULL;
    
    char arr[30];
    long long int number = 0;

    int t; scanf("%d", &t);
    while (t--) {
        printf("enter name and number: ");
        scanf("%s %lld", arr, &number);
        root = insert(root, arr, number);
    }

    printf("****************************\n\tPhone-Book\n");
    print(root);
    printf("****************************\n");
}   

