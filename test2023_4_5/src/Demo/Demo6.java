package Demo;

import java.util.HashMap;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-05 20:31
 **/
public class Demo6 {
    public static void main (String[] args) {
        Integer a = 127;//当他们的值超过128 就会创建一个对象
        Integer b = 127;
        System.out.println(a == b);
        HashMap<Integer,Integer> map =  new HashMap<>();
    }
}
