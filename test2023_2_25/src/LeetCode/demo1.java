package LeetCode;

import java.util.Stack;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-25 11:50
 **/
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
public class demo1 {
    public static void main (String[] args) {
        System.out.println("hello");
    }
    public String tree2str(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        stack.push(root);
        TreeNode cur = null;
        while(!stack.isEmpty()){
            cur = stack.peek();
            str.append(cur.val);
            if(cur != root && cur.left != null){
                str.append("(");
                stack.push(cur.left);
            }
        }
        return str.toString();
    }
    //根据二叉树创建字符串
    public void _tree2str(TreeNode root,StringBuilder str){
        if(root == null){
            return ;
        }
        str.append(root.val);
        if(root.left != null){
            str.append("(");
        }
        _tree2str(root.left,str);
        if(root.left != null){
            str.append(")");
        }
        if(root.left == null && root.right != null){
            str.append("()");
        }
        if(root.right != null){
            str.append("(");
        }
        _tree2str(root.right,str);
        if(root.right != null){
            str.append(")");
        }
    }
    public String tree2str1(TreeNode root) {
        StringBuilder str = new StringBuilder();
        _tree2str(root,str);
        return str.toString();
    }
    //根据一颗树的中序遍历和后序遍历构造二叉树
    //private int i = 0;
    public TreeNode buildTree1(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null){
            return null;
        }
        i = inorder.length - 1;
        return counst1(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode counst1(int[] inorder,int[] postorder,int s1,int s2){
        if(s1 > s2){
            return null;
        }
        TreeNode node = new TreeNode(postorder[i]);
        int index = findIndex1(inorder,postorder[i],s1,s2);
        if(index == -1){
            return null;
        }
        i--;
        node.right = counst(inorder,postorder,index+1,s2);
        node.left = counst(inorder,postorder,s1,index-1);
        return node;
    }
    public int findIndex1(int[] inorder,int val,int s1,int s2){
        for(int j = s1;j <= s2; j++){
            if(inorder[j] == val){
                return j;
            }
        }
        return -1;
    }
    //根据一棵树的前序遍历与中序遍历构造二叉树。
    private int i = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null){
            return null;
        }
        return counst(preorder,inorder,0,inorder.length-1);
    }

    public TreeNode counst(int[] preorder,int[] inorder,int s1,int s2){
        if(s1 > s2){
            return null;
        }
        TreeNode node = new TreeNode(preorder[i]);
        int index = findIndex(inorder,s1,s2,preorder[i]);
        if(index == -1){
            return null;
        }
        i++;
        node.left = counst(preorder,inorder,s1,index-1);
        node.right = counst(preorder,inorder,index+1,s2);
        return node;
    }
    public int findIndex(int[] inorder,int s1,int s2,int val){
        for(int j = s1; j <= s2;j++){
            if(inorder[j] == val){
                return j;
            }
        }
        return -1;
    }
    //最近公共祖先
    //题解1
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null){
            return root;
        }
        if(left == null){
            return right;
        }
        return left;
    }
    //题解2
    public boolean addStack(TreeNode root,Stack<TreeNode> stack, TreeNode node){
        if(root == null || node == null){
            return false;
        }
        stack.push(root);
        if(root == node){
            return true;
        }
        boolean ret1 = addStack(root.left,stack,node);
        if(ret1){
            return true;
        }
        boolean ret2 = addStack(root.right,stack,node);
        if(ret2){
            return true;
        }
        stack.pop();
        return false;
    }
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> stackp = new Stack<>();
        Stack<TreeNode> stackq = new Stack<>();
        addStack(root,stackp,p);
        addStack(root,stackq,q);
        //计算两个栈的长度
        int len1 = stackp.size();
        int len2 = stackq.size();
        if(len1 > len2){
            while(len1 - len2 > 0){
                len1--;
                stackp.pop();
            }
        }else {
            while(len2 - len1 > 0){
                len2--;
                stackq.pop();
            }
        }
        while(true){
            if(stackp.isEmpty()||stackq.isEmpty()){
                break;
            }
            if(stackp.peek() == stackq.peek()){
                return stackp.peek();
            }
            stackp.pop();
            stackq.pop();
        }
        return null;
    }
}
