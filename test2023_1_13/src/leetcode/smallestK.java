package leetcode;

import java.util.PriorityQueue;

/**
 * 最小k个数
 */
public class smallestK {
    public int[] smallestK(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>((s1, s2)->{return s2-s1;});
        int[] array=new int[k];
        if(arr==null||k==0){
            return array;
        }
        for(int i=0;i<k;i++){
            priorityQueue.offer(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]<priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.offer(arr[i]);
            }
        }
        for(int i=0;i<k;i++){
            array[i]=priorityQueue.poll();
        }
        return array;
    }
}
