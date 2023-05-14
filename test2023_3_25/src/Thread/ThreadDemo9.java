package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 20:38
 **/
public class ThreadDemo9 {
    public static void main (String[] args) {
        //创建一个有固定线程数量的线程池
        ExecutorService pool = Executors.newFixedThreadPool(10);
        //创建一个自动适应线程数量的线程池
        ExecutorService pool1 = Executors.newCachedThreadPool();
        //创建一个只有一个线程的线程池
        ExecutorService pool2 = Executors.newSingleThreadExecutor();
        //创建一个带有定时器功能的线程池
        ExecutorService pool3 = Executors.newScheduledThreadPool(10);
    }
}
