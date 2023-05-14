package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-22 14:37
 **/
public class Demo4 {
    public static void main (String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
