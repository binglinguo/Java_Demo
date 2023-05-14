package Sort;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 插入排序
 * 时间复杂度O(N^2)
 * 最好情况O(N)最好的情况是本身就是有序的
 * 空间复杂度O(1)
 * 稳定性：稳定
 * 一个稳定的排序，可以实现为不稳定的
 * 但是一个本身就不稳定的排序是不可以变成稳定的排序
 */
public class insertSort {
    public static void insertSort(int[] array){
        for(int i=1;i<array.length;i++){
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
        int[] array={5,2,1,6,4,3,9,8,7,10,321,56341,561,651,65,161};

        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}