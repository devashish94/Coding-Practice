import java.util.Scanner;

class Node {
    int data;
    Node right;
    Node (int data) {
        this.data = data;
        right = null;
    }
}

public final class IDE {
    static Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        node.right = insert(node.right, data);
        return node;
    }

    static void show(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " -> ");
        show(node.right);
    }

    static void reversePrint(Node node) {
        if (node == null) {
            return;
        }
        show(node.right);
        System.out.print(node.data + " -> ");
    }

    public static void main(String[] args) {
        Node head = null;
        for (int i = 0; i < 10 ; i++) {
            head = insert(head, i + 1);
        }
        show(head);
        System.out.println();
        reversePrint(head);
    }
}

