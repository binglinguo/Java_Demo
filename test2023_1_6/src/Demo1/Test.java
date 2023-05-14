package Demo1;

import java.util.HashMap;
import java.util.PriorityQueue;

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val){
        this.val=val;
    }
}
public class Test {
    /**
     * 最后一块石头的重量
     */
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxTree=new PriorityQueue<>((x,y)->y-x);
        for (int x : stones) {
            maxTree.offer(x);
        }
        while(maxTree.size()>1){
            int y=maxTree.poll();
            int x=maxTree.poll();
            if(x<y){
                maxTree.offer(y-x);
            }
        }
        if(maxTree.size()==1){
            return maxTree.poll();
        }else {
            return 0;
        }
    }
    /**
     * 给定两个字符串 s1 和 s2 ，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串
     * @param s1
     * @param s2
     * @return
     */
    public boolean CheckPermutation(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            if(map.getOrDefault(s2.charAt(i),0)>=1){
                map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
            }else {
                return false;
            }
        }
        for(int i=0;i<s1.length();i++){
            if(map.get(s1.charAt(i))>=1){
                return false;
            }
        }
        return true;
    }
    public static void LeftRotateString(String str,int n){
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0 ; i <str.length(); i++) {
            stringBuffer.append(str.charAt(i));
        }
        stringBuffer.reverse();
        stringBuffer.delete(str.length()-n-1,str.length());
        for (int i = 0 ; i < n ; i++) {
            stringBuffer.append(str.charAt(i));
        }
    }
    /**
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成
     * 一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。时间复杂度小于O(n) ,空间复杂度
     * O(1)
     * @param arr
     * @param row
     * @param col
     * @param num
     * @return
     */
    public static boolean fnid_val(int [][]arr,int row,int col,int num) {
        int i=row-1;
        int j=0;
        while(i>=0&&j<col){
            if(num==arr[i][j]){
                return true;
            }else if(num<arr[i][j]){
                i--;
            }else{
                j++;
            }
        }
        return false;
    }
    public static void main1(String[] args) {
        int [][]array = {
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };
        System.out.println(fnid_val(array , 3 , 3 , 19));
    }
    //获取二叉树的高度
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        return leftHeight>rightHeight?leftHeight+1:rightHeight+1;
    }
    // 获取叶子节点的个数
    int getLeafNodeCount(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int left=0;
        if(root.left!=null){
            left=getLeafNodeCount(root.left);
        }
        int right=0;
        if(root.right!=null){
            right=getLeafNodeCount(root.right);
        }
        return left+right;
    }
    public int size(TreeNode root){
        int n=0;
        if(root==null){
            return n;
        }
        if(root!=null){
            n++;
        }
        int left=size(root.left);
        int right=size(root.right);
        return n+left+right;
    }
   /* //二叉树的前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(null==root){
            return list;
        }

        list.add(root.val);
        List<Integer> lefttree=preorderTraversal(root.left);
        list.addAll(lefttree);
        List<Integer> righttree=preorderTraversal(root.right);
        list.addAll(righttree);

        return list;
    }
    // 获取树中节点的个数
    public int size(TreeNode root) {
        if(root==null){
            return 0;
        }
        return size(root.left)+size(root.right)+1;
    }*/
}
