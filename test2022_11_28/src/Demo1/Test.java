package Demo1;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Test {
    /**
     * 中序
     * @param root
     * @param ret
     */
    public void _inorderTraversal(TreeNode root,List<Integer> ret){
        if(root==null){
            return ;
        }

        _inorderTraversal(root.left,ret);
        ret.add(root.val);
        _inorderTraversal(root.right,ret);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        _inorderTraversal(root,list);
        return list;
    }
    /**
     * 后序
     * @param root
     * @param ret
     */
    public void _postorderTraversal(TreeNode root,List<Integer> ret){
        if(root==null){
            return ;
        }

        _postorderTraversal(root.left,ret);
        _postorderTraversal(root.right,ret);
        ret.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        _postorderTraversal(root,list);
        return list;
    }
    /**
     * 前序
     * @param root
     * @param ret
     */
    public void _preorderTraversal(TreeNode root, List<Integer> ret){
        if(root==null){
            return ;
        }
        ret.add(root.val);
        _preorderTraversal(root.left,ret);
        _preorderTraversal(root.right,ret);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        _preorderTraversal(root,list);
        return list;
    }

    /**
     * 单值二叉树
     * @param root
     * @return
     */
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left!=null&&root.left.val!=root.val){
            return false;
        }
        if(root.right!=null&&root.right.val!=root.val){
            return false;
        }
        return isUnivalTree(root.left)&&isUnivalTree(root.right);
    }

    /**
     *检查两棵树是否相同
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null){
            return false;
        }
        if(q==null){
            return false;
        }
        if(p.val!=q.val)return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
