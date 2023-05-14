package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-16 21:43
 **/
public class Demo3 {
    public static void main (String[] args) {
        Thread t = new Thread(){
            @Override
            public void run () {
                fun();
            }
        };
        t.run();
        System.out.println("world");
    }
    public static void fun (){
        System.out.println("hello");
    }
}
