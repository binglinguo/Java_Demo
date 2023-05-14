package Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-22 23:13
 **/
//把数组排成最小数
public class demo10 {
    public String PrintMinNumber(int [] numbers) {
        if (numbers == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int x : numbers) {
            list.add(x);
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                String A = x + "" + y;
                String B = y + "" + x;
                return A.compareTo(B);
            }
        });
        StringBuilder str = new StringBuilder();
        for(int x:list){
            str.append(x);
        }
        return str.toString();
    }
}
