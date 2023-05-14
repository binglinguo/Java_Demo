package Sort;

import sun.net.www.HeaderParser;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[]  array={1561,56135,135,435,43,4,86,-5,153,412,12,1,61,6,5435,43,4,532463,85};

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
//        HillSort hillSort=new HillSort();
//        hillSort.sort(array);

        //堆排序
//        HeapSort heapSort=new HeapSort();
//        heapSort.sort(array);

        //快速排序
//        QuickSort quickSort=new QuickSort();
//        quickSort.sort(array);

        //归并排序
        MergerSort mergerSort=new MergerSort();
        mergerSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
