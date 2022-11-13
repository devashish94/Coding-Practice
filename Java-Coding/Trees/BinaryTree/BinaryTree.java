package Trees.BinaryTree;

public class BinaryTree {
    private Node root;

    BinaryTree(Integer data) {
        new Node(data);
    }

    int index = -1;
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
        System.out.println();
    }

}
