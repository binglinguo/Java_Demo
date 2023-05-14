package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-16 21:31
 **/
abstract class A{
    //abstract void a();
}
public class Demo1 extends A{
    public Demo1(){
        System.out.println("hello");
    }

    public static void main (String[] args) {
        Demo1 demo1 = new Demo1();
    }
}
