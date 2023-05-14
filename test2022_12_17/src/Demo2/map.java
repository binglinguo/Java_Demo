package Demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class map {


    public static Map<Integer,Integer> func(int[] array){
        //统计出现的次数，如果没有出现过，那么放入1，否则在之前的基础上+1
        Map<Integer,Integer> map=new HashMap<>();
//        for (int i = 0; i < array.length; i++) {
//            int n=0;
//            if(map.get(array[i])!=null){
//                n=map.get(array[i]);
//            }
//            map.put(array[i],n+1);
//        }
        for (int x:array) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return map;
    }
    //统计10w个数中所有数字出现的次数
    public static void main(String[] args) {
        int[] array=new int[10_0000];
        Random random=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(100)+1;
        }
        Map<Integer,Integer> map=func(array);
        System.out.println(map);
    }
}
