package LeetCode;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-11 21:07
 **/

/**
 * 二叉搜索树与双向链表
 * 牛客
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution {
    TreeNode prev = null;
    public void func(TreeNode root){
        if(root == null){
            return ;
        }
        func(root.left);
        root.left = prev;
        if(prev != null){
            prev.right = root;
        }
        prev = root;
        func(root.right);
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        func(pRootOfTree);
        TreeNode cur = pRootOfTree;
        while(cur != null && cur.left != null){
            cur = cur.left;
        }
        return cur;
    }
}
