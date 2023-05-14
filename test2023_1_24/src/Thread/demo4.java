package Thread;

/**
 * 方法3：使用匿名内部类来实现
 */
public class demo4 {
    public static void main (String[] args) {
        Thread t =new Thread(){
            @Override
            public void run () {
                System.out.println("hello Thread");
            }
        };
        t.start();
    }
}
