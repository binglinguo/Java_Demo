package Demo2;

public class Main {
    public static void main (String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        BinaryTree.TreeNode root=binaryTree.createTree();
        binaryTree.preOrder(root);
        System.out.println();
        binaryTree.levelOrder(root);
        System.out.println();
        System.out.println(binaryTree.isCompleteTree(root));
    }
}
