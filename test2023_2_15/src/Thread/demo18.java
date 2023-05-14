package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 23:02
 **/
public class demo18 {
    public static Object lock = new Object();
    public static void main (String[] args) throws InterruptedException {

        Thread t1 = new Thread(()-> {
            synchronized (lock){
                System.out.println("wait 前");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait 后");
            }
        });
        t1.start();
        Thread.sleep(5000);
        Thread t2 = new Thread(()-> {
            synchronized (lock){
                System.out.println("notify 前");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.notify();
                System.out.println("notify 后");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();

    }
}
