/* Implementation of Queue using Stack (actually 2 Stacks) */
#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};
typedef struct Node Node;

Node* newNode(int data) {
    Node* node = (Node*) malloc (sizeof(Node));
    node->data = data;
    node->next = NULL;
    return node;
}

Node* push(Node* head, int data) {
    if (head == NULL) {
        head = newNode(data);
        return head;
    }
    Node* node = newNode(data);
    node->next = head;
    return node;
}

int pop(Node** head) {
    if (*head == NULL) {
        return 0;
    }
    int current = (*head)->data;
    *head = (*head)->next;
    return current;
}

void show(Node* head) {
    if (head == NULL) {
        return;
    }
    printf("%d ", head->data);
    show(head->next);
}

int isEmpty(Node* head) {
    if (head == NULL) {
        return 1;
    }
    return 0;
}

void enqueue(Node** stack_one, Node** stack_two, int data) {
    while (!isEmpty(*stack_one)) {
        *stack_two = push(*stack_two, pop(stack_one));
    }
    *stack_one = push(*stack_one, data);
    while (!isEmpty(*stack_two)) {
        *stack_one = push(*stack_one, pop(stack_two));
    }
}

void dequeue(Node** stack_one) {
    if (*stack_one == NULL) {
        return;
    }
    printf("[DeQueue] %d was removed from the Queue\n", (*stack_one)->data);
    *stack_one = (*stack_one)->next;
}

int main() {
    //  Main logic for creating a queue using a stack: 
    //  1. For dequeue operation, simply use the pop function of stack
    //  2. For enqueue operation:
    //      a. Move all the elements of the stack_one to stack_two using the pop function
    //      b. push the new element inside the stack_one
    //      c. Move all the elements of stack_two back to the stack_one
    Node* stack_one = NULL;
    Node* stack_two = NULL;


    // EnQueue Operation
    for (int i = 0; i < 5; i++) {
        enqueue(&stack_one, &stack_two, i + 1);
    }
    
    show(stack_one); printf("\n"); // Print the Queue

    // DeQueue Operation
    dequeue(&stack_one);

    show(stack_one); printf("\n"); // Print the Queue
}