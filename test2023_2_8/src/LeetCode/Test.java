package LeetCode;

import java.util.*;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-08 20:05
 **/

public class Test {
    public static void main(String[] args) {
        //String[] words = {"a","b","a","c","d","a","c","e","e","a","e"};
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        List<String> ret = topKFrequent(words,2);
        System.out.println(ret);
    }
    /**
     * 前K个高频单词
     */
    public static List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        //1.存放数据进入Map
        for (String s : words) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        //2.使用优先级队列筛选出前K个
        PriorityQueue<Map.Entry<String,Integer>> queue = new PriorityQueue<>(k , new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare (Map.Entry<String, Integer> o1 , Map.Entry<String, Integer> o2) {
                if(o1.getValue().compareTo(o2.getValue()) == 0 ){
                    return  o2.getKey().compareTo(o1.getKey()) ;
                }
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        //进行筛选
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(queue.size() < k){
                queue.add(entry);
            }else {
                Map.Entry<String,Integer> top = queue.peek();
                if(top.getValue().compareTo(entry.getValue()) < 0){
                    queue.poll();
                    queue.add(entry);
                }else if(top.getValue().compareTo(entry.getValue()) == 0){
                    if(top.getKey().compareTo(entry.getKey()) > 0){
                        queue.poll();
                        queue.add(entry);
                    }
                }
            }
        }
        //3.存放到List
        List<String> list = new ArrayList<>();
        for (int i = 0 ; i < k ; i++) {
            list.add(queue.poll().getKey());
        }
        Collections.reverse(list);
        return list;
    }
    /**
     * 宝石与石头
     */
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for(int i = 0;i < jewels.length(); i++){
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
     * 牛客网 怀键盘打字
     * @param str1
     * @param str2
     */
    public static void func (String str1 , String str2) {
        Set<Character> set = new HashSet<>();
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        for (int i = 0 ; i < str2.length() ; i++) {
            set.add(str2.charAt(i));
        }
        for (int i = 0 ; i < str1.length() ; i++) {
            char ch = str1.charAt(i);
            if (! set.contains(ch)) {
                set.add(ch);
                System.out.print(ch);
            }
        }
    }

    public static void main1 (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        func(str1 , str2);
    }
}
