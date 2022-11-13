package Trees.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        Integer[] arr = {1, 2, 3, null, 4, null, null, null, null, null};
        Node root = tree.fromArray(arr);
        tree.preOrder(root);
    }
}
