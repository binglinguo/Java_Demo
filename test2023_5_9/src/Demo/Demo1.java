package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-09 20:06
 **/
class A{
    public A(){
        System.out.println("A的构造方法");
    }
    {
        System.out.println("A的构造代码块");
    }
    static {
        System.out.println("A的静态代码块");
    }
}
class B extends A{
    public B(){
        System.out.println("B的构造方法");
    }
    {
        System.out.println("B的构造方法块");
    }
    static{
        System.out.println("B的静态代码块");
    }
}
public class Demo1 extends B{
    public static void main (String[] args) {
        new Demo1();
        new Demo1();
    }
    static {
        System.out.println("Demo1静态代码块");
    }
}
