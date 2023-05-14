package Thread;

/**
 * 写法4：使用匿名内部类 将Runnable实例化并且重写run方法
 */
public class demo5 {
    public static void main (String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run () {
                System.out.println("hello runnable");
            }
        });
        t.start();
    }
}
