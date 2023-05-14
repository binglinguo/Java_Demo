package Sort;

import java.util.Arrays;

public class Main  {
    public static void main (String[] args) {
        int[] array={3,2,1,2,2,3,6,8,54156,156,156,156,1,1,561,651,5,156,156,1,
                561,56,1,132,123,1,156,1,64,98,489,746,589,4,89,489,4,84,6,84,6541
                ,416,4,89,7465,1,65,41685,4,89,984,561,98456,645,5,65,165,6541,512,
                6513,156,132};

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
