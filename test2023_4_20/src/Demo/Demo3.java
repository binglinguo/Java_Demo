package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-20 21:04
 **/
public class Demo3 {
    private int count;
    public static void main (String[] args) {
        Demo3 demo3 = new Demo3(88);
        System.out.println(demo3.count);
    }
    public Demo3(int a){
        count = a;
    }
}
