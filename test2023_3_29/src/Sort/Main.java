package Sort;

import java.util.Arrays;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-29 22:27
 **/
public class Main {
    public static void main (String[] args) {
        int[] array =new int[10_0000];
        for(int i = 0; i < 10_0000; i++){
            array[i] = 10_0000 - i;
        }
        //Arrays.sort(array);
        quicksort quicksort1 = new quicksort();
        quicksort1.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
