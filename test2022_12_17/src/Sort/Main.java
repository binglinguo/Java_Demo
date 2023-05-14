package Sort;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] array={2,1,3,65,5,4,6,6,8,96,45,4,5,8,2};
        /*{5,2,1,6,4,3,9,8,7,10,321,563,1,32132,1356,151
                ,51,561,563,1563,132,131,35,1532,1352,1,321,5631,561
                ,32,132,132,132,123,132,132,41,561,651,65,161};*/

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
//        mergesort mergesort=new mergesort();
//        mergesort.sort(array);

        //堆排序
        heapsort heapsort=new heapsort();
        heapsort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
