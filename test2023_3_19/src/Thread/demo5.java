package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-19 23:15
 **/
public class demo5 {
    public static void main (String[] args) {
        Thread c = new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"c");
        });
        Thread b = new Thread(()->{
            try {
                c.join();
                System.out.println(Thread.currentThread().getName()+"b");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread a = new Thread(()->{
            try {
                b.join();
                System.out.println(Thread.currentThread().getName()+"a");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        c.start();
        b.start();
        a.start();
    }
}
