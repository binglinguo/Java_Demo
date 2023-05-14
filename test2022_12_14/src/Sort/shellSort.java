package Sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 时间复杂度[和增量有关 数据越多 效率越高]O(N^1.3)~O(N^1.5)
 * 空间复杂度O(1)
 * 稳定性：不稳定
 */
public class shellSort {
    private static void shell(int[] array,int gep){
        for (int i = gep; i < array.length; i++) {
            int tmp=array[i];
            int j=i-gep;
            for (; j >=0 ; j-=gep) {
                if(array[j]>tmp){
                    array[j+gep]=array[j];
                }
                else{
                    break;
                }
            }
            array[j+gep]=tmp;
        }
    }
    public static void shellSort(int[] array){
        int gep=array.length/2;
        while(gep>1){
            shell(array,gep);
            gep/=2;
        }
        shell(array,1);
    }

    public static void main(String[] args) {
        int[] array={8,6,2,12,18,32132165,0,23,1523,156,123,23,65,456,2,0,48,1,320,230,2365,1,0,231,561,561,320,23,123,123,132,5241};

        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
}
