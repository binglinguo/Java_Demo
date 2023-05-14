package Demo2;

import java.util.*;

public class TopK {
    /**
     * TopK问题
     * 返回数组中前k个最小元素
     * @param arr
     * @param k
     * @return
     */
    /*PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(k, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });*/    //这句话的意思是建立一个k大小的优先级队列（堆） 传入比较方法设定优先级队列是大堆还是小堆
    public static ArrayList<Integer> Topk(int[] arr,int k){
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i <k ; i++) {
            if(priorityQueue.size()==k){
                if(priorityQueue.peek()>arr[i]){
                    priorityQueue.poll();
                    priorityQueue.offer(arr[i]);
                }
            }
            priorityQueue.offer(arr[i]);

        }
        ArrayList<Integer> array=new ArrayList<>();
        for (int i = 0; i <k ; i++) {
            array.add(priorityQueue.poll());
        }
        return array;
    }

    /**
     * 查找和最小的K对数字
     * @param nums1
     * @param nums2
     * @param k
     * @return
     */

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> priorityQueue=new PriorityQueue<>(k, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return (o2.get(0)+o2.get(1))-(o1.get(0)+o1.get(1));
            }
        });
        for (int i = 0; i < Math.min(k,nums1.length); i++) {
            for (int j = 0; j < Math.min(k,nums2.length); j++) {
                List<Integer> arrays=new ArrayList<>();
                arrays.add(nums1[i]);
                arrays.add(nums2[j]);
                if(priorityQueue.size()<k){
                    priorityQueue.offer(arrays);
                }else {
                    int top=priorityQueue.peek().get(0)+priorityQueue.peek().get(1);
                    int top1=arrays.get(0)+arrays.get(1);
                    if(top1<top){
                        priorityQueue.poll();
                        priorityQueue.offer(arrays);
                    }else {
                        break;
                    }
                }
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        for (int i = 0; i < k&&!priorityQueue.isEmpty(); i++) {
            list.add(priorityQueue.poll());
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={12,10,8,65,123,1};
        ArrayList<Integer> array=Topk(arr,3);
            System.out.print(array);
    }
}
