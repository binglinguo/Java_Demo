package Sort;

import java.util.Arrays;

/**
 * 选择排序
 * 时间复杂度O(N^2)
 * 空间复杂度O(1)
 * 稳定性：不稳定
 */
public class selectSort {

    public static void selectSort(int[] array){

        int min;
        for (int i = 0; i < array.length-1; i++) {
            min=i;
            for (int j = i; j < array.length; j++) {
                if(array[j]<array[min]){
                    min=j;
                }
            }
            if(min!=i){
                int tmp=array[i];
                array[i]=array[min];
                array[min]=tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array={8,6,2,12,18,32132165,0,23,1523,156,123,023,65,456,02,0,48,1,320,230,2365,1,0,231,561,561,320,23,123,123,132,5241};

        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
