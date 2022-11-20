package Trees.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        Integer[] arr = {1, 2, 3, 4, null, null, 5, null, null, 6, 12, null, null, 13, null, null, 7, 8, 14, null, null, 15, null, null, 9, 10, null, null, 11, null, null};
        Node root = tree.fromArray(arr);
        System.out.print("Pre-Order: ");
        tree.preOrder(root);
        System.out.println();
        tree.bfs(root);
    }
}
