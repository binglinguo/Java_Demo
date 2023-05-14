package dome3;


class A{
    static {
        System.out.println("A静态代码块");
    }
    public A(){
        System.out.println("A构造代码块");
    }
    {
        System.out.println("A静态代码块");
    }

}

class B extends A{
    static {
        System.out.println("B静态代码块");
    }
    public B(){
        System.out.println("B构造代码块");
    }
    {
        System.out.println("B静态代码块");
    }

}
public class test {
    public static void main(String[] args) {
        B b=new B();
    }
}
