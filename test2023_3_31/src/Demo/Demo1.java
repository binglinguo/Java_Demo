package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-31 21:16
 **/
abstract class A{
    public int a = 1;
    public abstract void fun(int a);
    public void fun(){

    }
}
public class Demo1 {
    public static void add(int b){
        b++;
    }
    public static void test(){
        byte a = 127;
        byte b = 127;
        add(a++);
        System.out.println(a);
    }
    public static void main (String[] args) {
        test();
    }
}
