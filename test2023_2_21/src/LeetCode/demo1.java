package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-21 22:49
 **/
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
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
 //二叉树展开为链表
public class demo1 {
    private TreeNode prev = null;
    public void flatten(TreeNode root) {
        if( root == null){
            return ;
        }
        TreeNode right = root.right;
        if(prev != null){
            prev.right = root;
        }
        prev = root;
        flatten(root.left);
        flatten(right);
        root.left = null;
    }
    //N叉树的后序遍历
    public void _postorder(Node root,List<Integer> list){
        if(root == null){
            return ;
        }
        for(Node cur : root.children){
            _postorder(cur,list);
        }
        list.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> list = new LinkedList<>();
        _postorder(root,list);
        return list;
    }
    //N叉树的前序遍历
    public List<Integer> preorder(Node root) {
        List<Integer> list = new LinkedList<>();
        func(root,list);
        return list;
    }
    public void func(Node root,List<Integer> list){
        if(root == null){
            return ;
        }
        list.add(root.val);
        for(Node n : root.children){
            func(n,list);
        }
    }
}
