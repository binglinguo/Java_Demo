package Code;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-22 23:27
 **/
//求二叉树的深度
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}
public class demo12 {
    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return left > right ? left + 1:right + 1;
    }
}
