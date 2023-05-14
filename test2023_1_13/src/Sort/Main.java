package Sort;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] array={5,5,156,135,12,4,3,458,41,-9,16,1,6,41,5,6,51,654,86,486,4,5};

        //冒泡排序
//        BubbleSort bubbleSort=new BubbleSort();
//        bubbleSort.sort(array);

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
