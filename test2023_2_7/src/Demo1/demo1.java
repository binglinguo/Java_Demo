package Demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-07 11:38
 **/
class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
}
public class demo1 {
    public TreeNode prev=null;
    public void inorderTree(TreeNode root){
        if(root==null){
            return ;
        }
        inorderTree(root.left);

        root.left=prev;
        if(prev!=null){
            prev.right=root;
        }
        prev=root;
        inorderTree(root.right);

    }
    public TreeNode Convert(TreeNode root) {
        if(root==null){
            return null;
        }
        inorderTree(root);
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int x:nums){
            if(map.get(x)==1){
                return x;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        int[] array = {1,2,3,3,2,1,1,2,3,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x : array) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
    }
    public static void func1(int[] array){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < array.length ; i++) {
           map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
    }
    public static List func(int[] array){
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < array.length ; i++) {
            if(!set.contains(array[i])){
                list.add(array[i]);
                set.add(array[i]);
            }
        }
        return list;
    }
    public static void main1 (String[] args) {
        int[] array = {1,2,341,561,65,132,435,341,2,12,12,12,31,1,23,13,1};
        List<Integer> list = func(array);
        for (Integer i : list) {
            System.out.print(i+" ");
        }
    }
}
