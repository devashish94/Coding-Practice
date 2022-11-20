package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    BinaryTree(Integer data) {
        new Node(data);
    }

    private Integer index = -1;
    Node fromArray(Integer[] arr) {
        index++;
        if (arr[index] == null) {
            return null;
        }
        Node node = new Node(arr[index]);
        node.left = fromArray(arr);
        node.right = fromArray(arr);
        return node;
    }


    void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void bfs(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node t = q.remove();
                if (t == null) System.out.print("null ");
                else System.out.print(t.val + " ");
                if (t != null) {
                    q.add(t.left);
                    q.add(t.right);
                }
            }
            System.out.println();
        }
    }
}
