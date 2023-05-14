package Demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-18 20:44
 **/
//二叉树的层序遍历
public class demo8 {
    public static void main (String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(()->{
            return o1 - o2;
        });
    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(cur.left != null){
                queue.offer(cur.left);
            }
            if(cur.right != null){
                queue.offer(cur.right);
            }
            list.add(cur.val);
        }
        return list;
    }
}
