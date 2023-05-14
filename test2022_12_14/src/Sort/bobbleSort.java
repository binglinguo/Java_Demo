package Sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 时间复杂度O(N^2)
 * 空间复杂度O(1)
 * 稳定性：稳定
 */
public class bobbleSort {
    public static void bobbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array={8,6,2,12,18,32132165,0,23,1523,156,123,023,65,456,02,0,48,1,320,230,2365,1,0,231,561,561,320,23,123,123,132,5241};
       
        bobbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
