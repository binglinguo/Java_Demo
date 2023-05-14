package Demo;
import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-03-24 00:07
 **/
//之字打印二叉树
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}
public class demo9 {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList < ArrayList<Integer>> lists = new ArrayList<>();
        if(pRoot == null){
            return lists;
        }
        Stack<TreeNode> stack = new Stack<>();
        //辅助队列
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode cur = pRoot;
        int flg  = 1;
        stack.push(cur);
        while (!stack.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = stack.size();
            while (size > 0) {
                cur = stack.pop();
                list.add(cur.val);
                if (flg == 1) {
                    if (cur.left != null) {
                        queue.offer(cur.left);
                    }
                    if (cur.right != null) {
                        queue.offer(cur.right);
                    }
                } else {
                    if (cur.right != null) {
                        queue.offer(cur.right);
                    }
                    if (cur.left != null) {
                        queue.offer(cur.left);
                    }
                }
                size--;
            }
            flg = - flg;
            lists.add(list);
            while (!queue.isEmpty()) {
                stack.push(queue.poll());
            }
        }
        return lists;
    }
}
