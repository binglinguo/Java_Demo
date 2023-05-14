package Sort;

import java.util.Arrays;

public class Main  {
    public static void main (String[] args) {
        int[] array={5,5,4,56,1,321,36,84,864,35,46,46,3
                ,5,465,465,46,4,8,84,87,6,56,535,3545343,
                4,84,654,63,546846835,4,35,43,435435,43,68,4,834,38,435};

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
