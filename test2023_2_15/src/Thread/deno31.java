package Thread;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-17 11:05
 **/
public class deno31 {
    public static void main (String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);
        for (int i = 0 ; i < 5 ; i++) {
            Thread t = new Thread(()->{
                try {
                    Thread.sleep(3000);
                    System.out.println(Thread.currentThread().getName()+" 到达终点!");
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t.start();
        }
        latch.await();
        System.out.println("比赛结束");
    }
}
