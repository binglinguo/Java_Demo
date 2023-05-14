package Demo;

import java.util.*;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-18 23:12
 **/
//寻找第三大的数 当已知要找第几大数字  是不能topK
public class demo9 {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.size() < 3 ? list.get(list.size() - 1) : list.get(list.size() - 3);
    }
    public int thirdMax1(int[] nums) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(3);
        for(int i = 0; i < nums.length ; i++){
            if(heap.size() < 3 || (!heap.isEmpty() && heap.peek() != nums[i])){
                heap.offer(nums[i]);
            }else {
                if(heap.peek() < nums[i]){
                    heap.poll();
                    heap.offer(nums[i]);
                }
            }
        }
        if(heap.size() == 3){
            return heap.peek();
        }else {
            int ret = 0;
            while(!heap.isEmpty()){
                ret = heap.poll();
            }
            return ret;
        }

    }
}
