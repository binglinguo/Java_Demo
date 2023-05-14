package Demo;

import java.util.ArrayList;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-20 10:50
 **/
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
}
//输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点
//开始往下一直到叶结点所经过的结点形成一条路径。
public class demo2 {
    public void FindPathDPS(TreeNode root, ArrayList<ArrayList<Integer>> result, int num, ArrayList<Integer> list){
        if(root == null){
            return ;
        }
        list.add(root.val);
        num -= root.val;
        if(root.left == null && root .right == null && num == 0){
            result.add(new ArrayList<Integer>(list));//注意深浅拷贝
        }
        FindPathDPS(root.left,result,num,list);
        FindPathDPS(root.right,result,num,list);
        list.remove(list.size()-1);
    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int expectNumber) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return result;
        }
        ArrayList<Integer> list = new ArrayList<>();
        FindPathDPS(root,result,expectNumber,list);
        return result;
    }
}
