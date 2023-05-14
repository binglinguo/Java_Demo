package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-02 15:42
 **/
class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (int val) {
        this.val = val;
    }
}
public class Demo2 {
    public static void main (String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        c.left = b;
        b.left = a;
        c.right = d;
        Demo2 demo2 = new Demo2();
        TreeNode cur = demo2.find(3,c);
        System.out.println(cur.val);
    }
    public TreeNode find(int val,TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode cur = null;
        if(root.val == val){
            return root;
        }else if(root.val < val){
            cur = find(val,root.right);
        }else {
            cur = find(val,root.left);
        }
        return cur;
    }
    public TreeNode find1(int val,TreeNode root){
        if(root == null){
            return null;
        }
        if(val == root.val){
            return root;
        }
        TreeNode left = find1(val,root.left);
        if(left != null){
            return left;
        }
        TreeNode right = find1(val,root.right);
        if(right != null){
            return right;
        }
        return null;
    }
}
