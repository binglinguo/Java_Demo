package Demo2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array={5,2,1,6,1,4,3,9,8,7,10,321,56341,561,651,65,161};

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

        //快速排序
//        quicksort quicksort=new quicksort();
//        quicksort.sort(array);

        //归并排序
        mergesort mergesort=new mergesort();
        mergesort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
