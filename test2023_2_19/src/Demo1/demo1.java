package Demo1;

import java.lang.reflect.Field;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-19 19:20
 **/
public class demo1 {
    public static void main (String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = "hello";
        System.out.println(s);
        Class cls = s.getClass();
        Field valueField = cls.getDeclaredField("value");
        valueField.setAccessible(true);
        char[] value = (char[]) valueField.get(s);
        value[0]='g';
        System.out.println(s);
        String s1 = new String("hello");
        System.out.println(s1);
    }
}
