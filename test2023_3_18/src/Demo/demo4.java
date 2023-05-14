package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-18 11:30
 **/
//镜像二叉树
public class demo4 {
    //交换节点
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
    //创建节点
    public TreeNode mirrorTree1(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode cur = new TreeNode(root.val);
        if(root.right != null){
            cur.left = mirrorTree(root.right);
        }else {
            cur.left = null;
        }
        if(root.left != null){
            cur.right = mirrorTree(root.left);
        }else {
            cur.right = null;
        }
        return cur;
    }
}
