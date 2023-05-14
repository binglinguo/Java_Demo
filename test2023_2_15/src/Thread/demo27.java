package Thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-17 10:33
 **/
public class demo27 {
    public static void main (String[] args) throws InterruptedException {
        AtomicInteger num = new AtomicInteger(0);
        Thread t1 = new Thread(()->{
            for (int i = 0 ; i < 5000 ; i++) {
                num.getAndIncrement();
            }
        });
        t1.start();
        Thread t2 = new Thread(()->{
            for (int i = 0 ; i < 5000 ; i++) {
                num.getAndIncrement();
            }
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println(num.get());
    }
}
