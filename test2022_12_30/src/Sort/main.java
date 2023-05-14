package Sort;

import java.util.Arrays;

public class main {
    public static void main (String[] args) {
        int[] array={5,5,21,512,13,1,31,651,56,156,45,1,86574,8,48,74,89
                ,45,49,4,4,56,6,54,45,6,48,4,8,5,49,64,84,65,4};

        //冒泡排序
//        bobblesort bobblesort=new bobblesort();
//        bobblesort.sort(array);

        //选择排序
//        choicesort choicesor=new choicesort();
//        choicesor.sort(array);

        //插入排序
//        insertsort insertsor=new insertsort();
//        insertsor.sort(array);

        //希尔排序
//        hilllsort hilllsort=new hilllsort();
//        hilllsort.sort(array);

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
