package Demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class onemap {
    public static int func(int[] array){
        Map<Integer,Integer> map=new HashMap<>();
        for (Integer x:array) {
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.get(x)==2){
                return x;
            }
        }
        return -1;
    }
    //从10w个数据中找出第一个重复的元素
    public static void main(String[] args) {
        int[] array=new int[10_0000];
        Random random=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(15);
        }
        int ret=func(array);
        System.out.println(ret);
    }
}
