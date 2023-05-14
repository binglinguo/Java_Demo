package Demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-23 21:57
 **/
//数组中只出现一次的两个数字
public class demo1 {
    public void FindNumsAppearOnce(int [] array, int num1[], int num2[]) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        for (int i  = 0 ; i < array.length ; i++) {
            if (map.get(array[i] ) == 1 && num1[0] == 0) {
                num1[0] = array[i];
            }else if (map.get(array[i] ) == 1 && num2[0] == 0) {
                num2[0] = array[i];
            }
        }
    }
}
