package Sort;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] array={5,1,15,156,132,164,86,151,65,11,651,561,321,23163,5498,4,561,5641685,165,56};

        //冒泡排序
//        bobblesort bobblesort=new bobblesort();
//        bobblesort.sort(array);

        //选择排序
//        choicesort choicesort=new choicesort();
//        choicesort.sort(array);

//        //插入排序
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
        mergesort mergesort=new mergesort();
        mergesort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
