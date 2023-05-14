package Demo2;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Test  {
    /**
     * 构建一棵树的镜像二叉树
     */
    public void _mirrorTree(TreeNode root){
        if(root==null){
            return ;
        }
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        _mirrorTree(root.left);
        _mirrorTree(root.right);
    }
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)return null;
        _mirrorTree(root);
        return root;
    }
    /**
     后序遍历非递归实现
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        TreeNode prev=null;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            TreeNode ret=stack.peek();
            if(ret.right==null||ret.right==prev){
                list.add(ret.val);
                stack.pop();
                prev=ret;
            }else {
                cur=ret.right;
            }
        }
        return list;
    }
    /**
     中序遍历非递归实现
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            cur=stack.pop();
            list.add(cur.val);
            cur=cur.right;
        }
        return list;
    }
    /**
     前序遍历非递归实现
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;

        while(cur!=null||!stack.isEmpty()){
            while(cur!=null){
                list.add(cur.val);
                stack.push(cur);
                cur=cur.left;
            }
            cur=stack.pop().right;
            //cur=cur;
        }
        return list;
    }

//    public static void main(String[] args) {
//        System.out.println(666);
//    }
}


