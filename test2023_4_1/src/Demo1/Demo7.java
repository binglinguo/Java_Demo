package Demo1;

import java.util.Arrays;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-01 21:46
 **/
public class Demo7 {

    public static void main1 (String[] args) {
        int[] array = {13,21,51,51,5,3135,3546,1};
        for(int i = 0;i < array.length; i++){
            int minIndex = i;
            for(int j = i + 1;j < array.length; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int t = array[minIndex];
                array[minIndex] = array[i];
                array[i] = t;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
