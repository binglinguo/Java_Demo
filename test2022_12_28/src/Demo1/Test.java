package Demo1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Test {
    /**
     * 从上到下打印二叉树
     * @param args
     */

    public int[] levelOrder(TreeNode root) {
        if(root==null)return new int[0];
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> list=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
            }
            list.add(cur.val);
        }
        int[] ret=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ret[i]=list.get(i);
        }
        return ret;
    }
    public static void main (String[] args) {
        System.out.println(1);
    }
}
