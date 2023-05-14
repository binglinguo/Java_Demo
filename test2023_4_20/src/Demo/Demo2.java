package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-20 20:59
 **/
public class Demo2 {
    private String name = "abc";
    public static void main (String[] args) {
        Demo2 demo2 = new Demo2();
        Demo2 demo21 = new Demo2();
        boolean s = demo2.equals(demo21);
        System.out.println(  "," + demo2.name.equals(demo21.name));
    }
}
