package Demo2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ste {
    public static Set<Integer> func(int[] array){
        Set<Integer> set=new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        return set;
    }
    //将10w个数据去重
    public static void main(String[] args) {
        int[] array=new int[10_0000];
        Random random=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(10);
        }
        Set<Integer> set=func(array);
        for (Integer x:set) {
            System.out.print(x+" ");
        }
    }
}
