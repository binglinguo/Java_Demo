package Demo1;

import java.util.PriorityQueue;

public class Test {
    public static int[] maxK(int[] arr,int k){
        int[] ret=new int[k];
        if(arr==null||k==0){
            return ret;
        }
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(k);
        for (int i = 0 ; i < k ; i++) {
            priorityQueue.offer(arr[i]);
        }
        for (int i = k ; i < arr.length ; i++) {
            if(arr[i]>priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.offer(arr[i]);
            }
        }
        for (int i = 0 ; i < k ; i++) {
            ret[i]=priorityQueue.poll();
        }
        return ret;
    }
    public static void selectSort(int[] array) {
        for (int i = 0 ; i < array.length - 1 ; i++) {
            int min=i;
            for (int j = i + 1 ; j < array.length  ; j++) {
                if(array[min]>array[j]){
                    min=j;
                }
            }
            if(min!=i){
                int t=array[min];
                array[min]=array[i];
                array[i]=t;
            }
        }
    }
    public static void shellSort(int[] array) {
        int gap = array.length;
        while (gap > 1) {
            shell(array,gap);
            gap /= 2;
        }
//整体进行插入排序
        shell(array,1);
    }

    public static void shell(int[] array,int gap) {
        for (int i = gap ; i < array.length ; i+=gap) {
            int tmp=array[i];
            int j=i-gap;
            for (; j>=0; j-=gap){
                if(array[j]>tmp){
                    array[j+gap]=array[j];
                }else {
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }
    public static void insertSort(int[] array) {
        for (int i = 1 ; i < array.length ; i++) {
            int tmp = array[i];
            int j = i-1;
            for ( ; j >= 0; j--){
                if(array[j] > tmp){
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
}
