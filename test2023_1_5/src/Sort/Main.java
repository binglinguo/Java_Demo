package Sort;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        int[] array={7098,-11861,-10838,16065,1574,-14816,14058,4073,543,-6599,18733,1,
                11511,16507,-7858,17115,-18899,-8114,14349,-6602,16439,-2423,-4511,-16445,19585,
                4516,-3185,-18188,-12767,2144,-19310,-8611,2512,-876,-10394,-3275,9045,8939,-11810,
                633,-5509,11015,-16765,6359,-1538,11475,5550,15315,-16416,11495,-3879,6966,-9011,15834,
                14237,763,-18253, -1629,1249,2780,-1068,-406,-12317,15938,10369,-5423,4533,17134,-11962
                };

        // 冒泡排序
//        bobblesort bobblesort=new bobblesort();
//        bobblesort.sort(array);

        //选择排序
//        choiceSort choiceSort=new choiceSort();
//        choiceSort.sort(array);

        //插入排序
//        choiceSort choiceSort=new choiceSort();
//        choiceSort.sort(array);

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
