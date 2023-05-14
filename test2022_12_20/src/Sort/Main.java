package Sort;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] array={2,1,3,65,5,4,6,6,8,96,45,4,5,8,2};
        /*{2,1,3,2,1,3,2,25,2,5,12356,4,564,561,56,156,156,1,561,325,16
                ,156,1,564,156,48,16,51,8654,156,156,1,56,156,4865,3524};*/

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
        heapsort heapsort=new heapsort();
        heapsort.sort(array);

        //快速排序
//        quicksort quicksort=new quicksort();
//        quicksort.sort(array);

        //归并排序
//        mergesort mergesort=new mergesort();
//        mergesort.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
