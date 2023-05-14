package Thread;

public class Demo1 {
    public static void main (String[] args) throws InterruptedException {
        Object object = new Object();
        System.out.println("wait 前 ");
        object.wait();
        System.out.println("wait 后");
    }
}
