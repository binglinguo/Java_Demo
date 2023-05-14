package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-21 22:39
 **/
public class Demo3 {
    public static void main (String[] args) {
        Integer i1 = 59;
        int i2 = 59;
        Integer i3 = Integer.valueOf(59);
        Integer i4 = new Integer(59);
        System.out.println(i1 == i2);
        System.out.println(i3 == i2);
        System.out.println(i4 == i2);
        System.out.println(i3 == i1);
        System.out.println(i3 == i4);
    }
}
