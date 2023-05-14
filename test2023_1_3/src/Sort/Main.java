package Sort;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] array={2,1,3,6,1,65,56,56,48,486,4865,45,435,465,7,36,54,351,355,13,531};

        //冒泡排序
//        bobblesort bobblesort=new bobblesort();
//        bobblesort.sort(array);

        //选择排序
//        choicesoet choicesoet=new choicesoet();
//        choicesoet.sort(array);

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
