package Demo1;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。(牛客不带循环)
 */

public class Test2 {
    public TreeNode prev=null;
    public void inorderTree(TreeNode root){
        if(root==null){
            return ;
        }
        inorderTree(root.left);

        root.left=prev;
        if(prev!=null){
            prev.right=root;
        }
        prev=root;
        inorderTree(root.right);

    }
    public TreeNode Convert(TreeNode root) {
        if(root==null){
            return null;
        }
        inorderTree(root);
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

}
