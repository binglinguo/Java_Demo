package Sort;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] array={2,1,3,5,1,1,2,3,5,5,5,7,9,9,26,5655,65,65,894,968,486,486,4,
                654,86,468,489,4,9864,8,489,46,54,15616,5-5,5,-9,5,5,-5,-23};


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
