package Demo1;

public class Test {
    public static void main(String[] args) {
        Binarytree binarytree = new Binarytree();
        BTNode root = binarytree.initalization();
        binarytree.preOrder(root);
        System.out.println();
        binarytree.inOrder(root);
        System.out.println();
        binarytree.preOrder(root);
    }
}
