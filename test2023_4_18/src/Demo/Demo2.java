package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-18 23:12
 **/
class A{
    public A(String s){

    }
}
public class Demo2 {
    public static void main (String[] args) {
        A a = new A("he");
        A b = new A("he");
        System.out.println(a == b);
    }
}
