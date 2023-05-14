package Sort;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] array={7,123,13,1,3541,35,45,34,3,153,5,1,13,51,35,4,1,43};

        //冒泡排序
//        BobbleSort bobbleSort=new BobbleSort();
//        bobbleSort.sort(array);

        //选择排序
//        ChoiceSort choiceSort=new ChoiceSort();
//        choiceSort.sort(array);

        //插入排序
//        InsertSort insertSort=new InsertSort();
//        insertSort.sort(array);

        //希尔排序
        HillSort hillSort=new HillSort();
        hillSort.sort(array);

        //堆排序
//        HeapSort heapSort=new HeapSort();
//        heapSort.sort(array);

        //快速排序
//        QuickSort quickSort=new QuickSort();
//        quickSort.sort(array);

        //归并排序
//        MergerSort mergerSort=new MergerSort();
//        mergerSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
