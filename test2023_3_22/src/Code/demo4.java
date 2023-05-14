package Code;
import java.util.*;
/**
 * @Author: 冰激凌
 * @Date: 2023-03-22 20:11
 **/
//topK 问题
public class demo4 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input == null || input.length == 0 || k == 0){
            return list;
        }else {
            PriorityQueue<Integer> heap = new PriorityQueue<>(k,new Comparator<Integer>(){
                public int compare(Integer o1,Integer o2){
                    return o2 - o1;
                }
            });
            for(int i = 0; i < input.length; i++){
                if(heap.size() < k){
                    heap.offer(input[i]);
                }else {
                    int ret = heap.peek();
                    if(ret > input[i]){
                        heap.poll();
                        heap.offer(input[i]);
                    }
                }
            }
            while(k > 0){
                list.add(heap.poll());
                k--;
            }
            return list;
        }
    }
}
