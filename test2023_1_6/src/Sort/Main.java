package Sort;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] array={5,1,2,1,61,3,1,68,84,654,6,48,46,4,4,64,-5,654};

        //冒泡排序
//        bobbleSort bobbleSort=new bobbleSort();
//        bobbleSort.sort(array);

        //选择排序
//        choiceSort choiceSort=new choiceSort();
//        choiceSort.sort(array);

        //插入排序
//        insertSort insertSort=new insertSort();
//        insertSort.sort(array);

        //希尔排序
//        hillSort hillSort=new hillSort();
//        hillSort.sort(array);

        //堆排序
//        heapSort heapSort=new heapSort();
//        heapSort.sort(array);

        //快速排序
//        quickSort quickSort=new quickSort();
//        quickSort.sort(array);

        //归并排序
        mergerSort mergerSort=new mergerSort();
        mergerSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
