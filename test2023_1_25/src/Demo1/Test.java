package Demo1;
class HelloA {
    public HelloA() {
        System.out.println("HelloA");
    } {
        System.out.println("i am A class");
    }
    static {
        System.out.println("static A");
    }
}
class TestClass extends HelloA {
    public TestClass () {
        System.out.println("TestClass");
    }

    {
        System.out.println("i am TestClass");
    }

    static {
        System.out.println("static TestClass");
    }
}
public class Test {
    public static void main(String[] args) {
        new TestClass();
    }
    public static void print(){
        System.out.println("MTDP");
    }
    public static void main1(String[] args) {
        try{
            ((Test)null).print();
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}
