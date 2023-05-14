/**
 * @Author: guo bing lin
 * @Date: 2023-02-12 09:55
 **/

import java.util.*;

/**
 * 前K个高频单词
 */
public class Main {
    public static List<String> topK(String[] strs,int k){
        Map<String,Integer> map = new HashMap<>();
        //使用哈希桶先计算出单词对应的个数
        for(String s : strs){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        //放入大根堆中
        PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<>(k , new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare (Map.Entry<String, Integer> o1 , Map.Entry<String, Integer> o2) {
                if(o1.getValue().compareTo(o2.getValue()) == 0){
                    return o2.getKey().compareTo(o1.getKey());
                }
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if(minHeap.size() < k){
                minHeap.offer(entry);
            }else {
                Map.Entry<String,Integer> top = minHeap.peek();
                if(entry.getValue().compareTo(top.getValue()) == 0){
                    if(entry.getKey().compareTo(top.getKey()) > 0){
                        minHeap.poll();
                        minHeap.offer(entry);
                    }
                }else if(entry.getValue().compareTo(top.getValue()) > 0){
                    minHeap.poll();
                    minHeap.offer(entry);
                }
            }
        }
        //存储到一个链表中
        List<String> list = new ArrayList<>();
        for(int i = 0; i < k; i++){
            list.add(minHeap.poll().getKey());
        }
        Collections.reverse(list);
        return list;
    }
    public static void main (String[] args) {
        String[] strs = {"hello","hello","bit","i","love","love","love","bit","hello","hello","bit","bit","hello"};
        List<String> list = topK(strs,3);
        System.out.println(list);
    }
}
