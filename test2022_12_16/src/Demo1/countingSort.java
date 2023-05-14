package Demo1;

import java.util.Arrays;

/**
 * 计数排序
 * 时间复杂度：O(N)
 * 空间复杂度O(M) M代表最大值减去最小值+1
 * 稳定性：稳定
 */
public class countingSort {
    public static void countingSort(int[] array){
        int maxval= array[0];
        int minval= array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>maxval){
                maxval=array[i];
            }
            if(array[i]<minval){
                minval=array[i];
            }
        }
        int[] ret=new int[maxval-minval+1];
        for (int i = 0; i < array.length; i++) {
            ret[array[i]-minval]++;
        }
        int k=0;
        for (int i = 0; i < ret.length; i++) {
            while(ret[i]>0){
                array[k]=i+minval;
                k++;
                ret[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array={903,909,912,956,945,905,906,908,932,974};
        countingSort(array);
        System.out.println(Arrays.toString(array));
    }
}
