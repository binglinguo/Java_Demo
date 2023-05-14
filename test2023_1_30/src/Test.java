/**
 * @Author: yeyulemon
 * @Date: 2023-01-30 19:35
 **/
class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }

}
public class Test {
    public static void preorderTraversal(TreeNode root){
        if(root==null){
            return ;
        }
        System.out.print(root.val+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void inorderTraversal(TreeNode root){
        if(root==null){
            return ;
        }
        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);
    }
    public static void postorderTraversal(TreeNode root){
        if(root==null){
            return ;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val+" ");
    }
}
