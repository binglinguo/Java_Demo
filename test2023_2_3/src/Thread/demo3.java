package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-03 23:01
 **/
public class demo3 {
    public static void main (String[] args) {
        //创建一个固定线程数目的线程池 参数指定了线程个数
        ExecutorService pool = Executors.newFixedThreadPool(10);
//        //创建一个自动扩容的线程池 会根据任务的数量来自动扩容
//        ExecutorService pool1 = Executors.newCachedThreadPool();
//        //创建一个只有一个线程的线程池
//        ExecutorService pool2 = Executors.newSingleThreadExecutor();
//        //创建一个带有定时器功能的线程池 类似Timer
//        ExecutorService pool3 = Executors.newScheduledThreadPool();
        for (int i = 0 ; i < 100 ; i++) {
            pool.submit(new Runnable() {
                @Override
                public void run () {
                    System.out.println("hello pool");
                }
            });
        }
/*        for (int i = 0 ; i < 100 ; i++) {
            System.out.println("main");
        }*/
    }
}
