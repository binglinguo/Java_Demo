package Demo;

import java.util.*;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class Test {
    /**
     * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list1=new ArrayList<>();
            list.add(list1);
            int size=queue.size();
            while(size>0){
                size--;
                TreeNode cur=queue.poll();
                if(cur!=null){
                    list1.add(cur.val);
                }else {
                    continue;
                }
                if(cur.left!=null){
                    queue.offer(cur.left);
                }
                if(cur.right!=null){
                    queue.offer(cur.right);
                }
            }
        }
        return list;
    }
    //error
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> list=new ArrayList<>();
//        Queue<TreeNode> queue=new LinkedList<>();
//        if(root==null){
//            return list;
//        }
//        int i=0;
//        queue.offer(root);
//        while(!queue.isEmpty()){
//
//            List<Integer> list1=new ArrayList<>();
//            if(queue.peek()!=null){
//                list.add(list1);
//            }
//            int n=(int)Math.pow(2,i);
//            while(n>0&&!queue.isEmpty()){
//                n--;
//                root=queue.poll();
//                if(root==null){
//                    break;
//                }else{
//                    list1.add(root.val);
//                }
//                queue.offer(root.left);
//                queue.offer(root.right);
//            }
//            i++;
//        }
//        return list;
//    }
    /**
     * 对称二叉树
     * @param rootleft
     * @param rootright
     * @return
     */
    public boolean isSymmetrics(TreeNode rootleft,TreeNode rootright){
        if(rootleft==null&&rootright==null){
            return true;
        }
        if(rootleft==null||rootright==null){
            return false;
        }
        if(rootleft.val!=rootright.val){
            return false;
        }
        return isSymmetrics(rootleft.left,rootright.right)&&isSymmetrics(rootleft.right,rootright.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isSymmetrics(root.left,root.right);
    }
    /**
     * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
     * @param s
     * @return
     */
    public char firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0 ; i < s.length() ; i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0 ; i < s.length() ; i++) {
            if(map.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
