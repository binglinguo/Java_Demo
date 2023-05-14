package Demo1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-14 13:47
 **/
public class demo1 {
    public static void main (String[] args) throws InterruptedException {
        AtomicInteger num = new AtomicInteger(0);
        Thread t1  = new Thread(new Runnable(){
            @Override
            public void run () {
                for (int i = 0 ; i < 5000 ; i++) {
                    num.getAndIncrement();
                }
            }
        });
        Thread t2  = new Thread(new Runnable() {
            @Override
            public void run () {
                for (int i = 0 ; i < 5000 ; i++) {
                    num.getAndIncrement();
                }
            }
        });
/*      //num++
        num.incrementAndGet();
        //++num
        num.getAndIncrement();
        //num--
        num.getAndDecrement();
        //--num
        num.decrementAndGet();
        //+=num +=10
        num.getAndAdd(10);*/
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(num.get());
    }
}
