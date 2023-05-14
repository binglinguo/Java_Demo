package Demo1;

import java.util.*;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val){
        this.val=val;
    }
}
public class Test {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> lists=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new LinkedList<>();
            while(size>0){
                root=queue.poll();
                size--;
                list.add(root.val);
                if(root.left!=null){
                    queue.offer(root.left);
                }
                if(root.right!=null){
                    queue.offer(root.right);
                }
            }
            lists.add(0,list);
        }
        return lists;
    }
    public int dayOfYear(String date) {
        int day=0;
        String[] dates=date.split("-");
        day=Integer.parseInt(dates[2]);
        int n=Integer.parseInt(dates[1]);
        if(isYear(Integer.parseInt(dates[0]))&&n>2){
            day++;
        }
        while(n>0){
            switch(n){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:day+=31;break;
                case 4:
                case 6:
                case 9:
                case 11:day+=30;break;
                case 2:day+=28;break;
            }
            n--;
        }
        return day;
    }
    public boolean isYear(int year){
        if(year%4==0&&year%100!=0||year%400==0){
            return true;
        }
        return false;
    }
    /**
     * 拼写单词
     * @param words
     * @param chars
     * @return
     */
    public int countCharacters(String[] words, String chars) {
        int count=0;
        for(String word:words){
            HashMap<Character,Integer> map=new HashMap<>();
            stringtomap(chars,map);
            count+=ismap(word,map);
        }
        return count;
    }

    public void stringtomap(String chars,HashMap<Character,Integer> map){
        for(int i=0;i<chars.length();i++){
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
    }

    public int ismap(String word,HashMap<Character,Integer> map){
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(map.getOrDefault(ch,0)>=1){
                map.put(ch,map.get(ch)-1);
            }else{
                return 0;
            }
        }
        return word.length();
    }
    /**
     * 输入一行字符，统计字符串中数字个数
     */

    public static int isNumeric(String str){
        int count=0;
        for (int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                count++;
            }
        }
        return count;
    }
    /**
     * 根据中序遍历和后序遍历构造二叉树
     */
//    public int i;
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        i=postorder.length-1;
//        if(inorder==null||postorder==null){
//            return null;
//        }
//        return counst(inorder,postorder,0,inorder.length-1);
//    }
//
//    public TreeNode counst(int[] inorder,int[] postorder,int s1,int s2){
//        if(s1>s2){
//            return null;
//        }
//        TreeNode node=new TreeNode(postorder[i]);
//        int Index=findIndex(inorder,s1,s2,postorder[i]);
//        i--;
//        node.right=counst(inorder,postorder,Index+1,s2);
//        node.left=counst(inorder,postorder,s1,Index-1);
//        return node;
//    }
//    public int findIndex(int[] inorder,int s1,int s2,int key){
//        for(int j=s1;j<=s2;j++){
//            if(inorder[j]==key){
//                return j;
//            }
//        }
//        return -1;
//    }

    /**
     * 根据前序遍历和中序遍历构造二叉树
     * @param root
     * @param node
     * @param stack
     * @return
     */
//    public static int i = 0;
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        TreeNode root=buildTreeChild(preorder,inorder,0,preorder.length-1);
//        return root;
//    }
//
//    public static TreeNode buildTreeChild(int[] preorder, int[] inorder,
//                                   int inbegin,int inend) {
//        if(inbegin > inend) {
//            return null;
//        }
//        TreeNode root = new TreeNode(preorder[i]);
////找到当前根，在中序遍历的位置
//        int rootIndex = findIndex(inorder,inbegin,inend,preorder[i]);
//        i++;
//        root.left = buildTreeChild(preorder,inorder,inbegin,rootIndex-1);
//        root.right = buildTreeChild(preorder,inorder,rootIndex+1,inend);
//        return root;
//    }
//
//    private static int findIndex( int[] inorder,int inbegin,int end, int key) {
//        for (int j = inbegin ; j <  end; j++) {
//            if(inorder[j]==key){
//                return j;
//            }
//        }
//        return -1;
//    }
    public boolean getPath(TreeNode root, TreeNode node,
                           Deque<TreeNode> stack) {
        if(root == null || node == null)return false;
        stack.push(root);
//放完之后 要检查
        if(root == node) return true;
        boolean ret1 = getPath(root.left,node,stack);
        if(ret1) return true;
        boolean ret2 = getPath(root.right,node,stack);
        if(ret2) return true;
        stack.pop();
        return false;
    }
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
//1、两个栈当中 存储好数据
        Deque<TreeNode> stack1 = new LinkedList<>();
        getPath(root , p , stack1);
        Deque<TreeNode> stack2 = new LinkedList<>();
        getPath(root , q , stack2);
//2、判断栈的大小
        int s1=stack1.size();
        int s2=stack2.size();
        if(s1>s2){
            int len=s1-s2;
            while(len>0){
                stack1.pop();
                len--;
            }
        }else{
            int len=s2-s1;
            while(len>0){
                stack2.pop();
                len--;
            }
        }
        while(!stack1.isEmpty()&&!stack2.isEmpty()){
            if(stack1.peek()!=stack2.peek()){
                return stack1.pop();
            }else{
                stack1.pop();
                stack2.pop();
            }
        }
        return null;
    }
    //时间复杂度O(N)
    //空间复杂度O(logN)
    public boolean rootisSymmetric(TreeNode rootLeft,TreeNode rootRight) {
        if(rootLeft==null&&rootRight==null){
            return true;
        }
        if(rootLeft==null||rootRight==null){
            return false;
        }
        if(rootLeft.val!= rootRight.val){
            return false;
        }
        return rootisSymmetric(rootLeft.left,rootRight.right)&&rootisSymmetric(rootLeft.right,rootRight.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return rootisSymmetric(root.left,root.right);
    }
}
