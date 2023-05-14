package Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] array={5,2,1,3,6,2,1,4,96,5,456,456,1,1561,1,51,3,153,1,31,3,1,32,6,5,456};

        //冒泡排序
//        bobblesort bobblesort=new bobblesort();
//        bobblesort.sort(array);

        //选择排序
//        choicesort choicesort=new choicesort();
//        choicesort.sort(array);

        //插入排序
//        insertsort insertsort=new insertsort();
//        insertsort.sort(array);

        //希尔排序
//        hillsort hillsort=new hillsort();
//        hillsort.sort(array);

        //堆排序
//        heapsort heapsort=new heapsort();
//        heapsort.sort(array);

        //快速排序
//        quicksort quicksort=new quicksort();
//        quicksort.sort(array);

        //归并排序
        mergersort mergersort=new mergersort();
        mergersort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
