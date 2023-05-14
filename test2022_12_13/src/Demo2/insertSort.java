package Demo2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 插入排序
 */
public class insertSort {
    public static void insertSort(int[] array){
        for(int i=1;i<array.length-1;i++){
            int tmp=array[i];
            int j=i-1;
            for (; j >=0 ; j--) {
                if(array[j]>tmp) {
                    array[j + 1] = array[j];
                }else{
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }

    public static void main(String[] args) {
        int[] array={8,6,2,12,18};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
