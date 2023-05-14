package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-14 21:59
 **/
//有20个线程，需要同时启动。
//每个线程按0-19的序号打印，如第一个线程需要打印0
//请设计代码，在main主线程中，等待所有子线程执行完后，再打印 ok
public class demo2 {
    public static int i = 0;
    public static void main (String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            for (; i < 20 ; i++) {
                Thread t1 = new Thread(()->{
                    System.out.print(i+" ");
                });
                t1.start();
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        t.join();
        System.out.println("ok");
    }
}
