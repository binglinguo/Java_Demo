package LeetCode;

import java.util.*;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-09 20:30
 **/
public class Test {
    /**
     * 存在重复元素进阶+1
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>(k+1);
        int j = 0;
        for(int i = 0;i < nums.length ; i++){
            if(i > k){
                set.remove(nums[j]);
                j++;
            }
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    /**
     * 存在重复元素进阶
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x:nums){
            if(set.contains(x)){
                return true;
            }
            set.add(x);
        }
        return false;
    }
    static class Node{
        public int val;
        public Node next;
        public Node random;
        public Node(int val){
            this.val = val;
        }
    }
    /**
     * 复制带随机指针的链表
     */
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<>();
        Node cur = head;
        while(cur != null){
            Node newCur = new Node(cur.val);
            map.put(cur,newCur);
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            Node ret = map.get(cur);
            ret.next = map.get(cur.next);
            ret.random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
    /**
     * 前K个高频单词
     */
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<>(k,new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare (Map.Entry<String, Integer> o1 , Map.Entry<String, Integer> o2) {
                if(o1.getValue().compareTo(o2.getValue()) == 0){
                    return o2.getKey().compareTo(o1.getKey());
                }
               return o1.getValue().compareTo(o2.getValue());
            }
        });
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(minHeap.size() < k){
                minHeap.add(entry);
            }else {
                Map.Entry<String,Integer> top = minHeap.peek();
                if(top.getValue().compareTo(entry.getValue()) < 0){
                    minHeap.poll();
                    minHeap.add(entry);
                }else if(top.getValue().compareTo(entry.getValue()) == 0){
                    if(top.getKey().compareTo(entry.getKey()) > 0){
                        minHeap.poll();
                        minHeap.add(entry);
                    }
                }
            }
        }
        List<String> list = new ArrayList<>();
        for(int i = 0; i < k; i++){
            list.add(minHeap.poll().getKey());
        }
        Collections.reverse(list);
        return list;
    }
    /**
     * 宝石与石头
     */
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < jewels.length(); i++){
            set.add(jewels.charAt(i));
        }
        int count = 0;
        for(int i = 0; i < stones.length(); i++){
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
    /**
     * 只出现一次的数字
     */
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            if(set.contains(x)){
                set.remove(x);
            }else {
                set.add(x);
            }
        }
        for(int x : nums){
            if(set.contains(x)){
                return x;
            }
        }
        return -1;
    }
}
