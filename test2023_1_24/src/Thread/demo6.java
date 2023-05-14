package Thread;

/**
 * 写法6 使用lambda表达式
 */
public class demo6 {
    public static void main (String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("hello thread");
        });
        t.start();
    }
}
