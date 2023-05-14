package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-24 22:40
 **/
public class pool {
    public static void main (String[] args) {
        //创建一个具有固定线程的线程池 参数指定了线程的个数
        ExecutorService pool = Executors.newFixedThreadPool(10);
        //创建一个自动扩容的线程池 会根据任务的数量来进行自动扩容
        ExecutorService pool1 = Executors.newCachedThreadPool();
        //创建一个只有一个线程的线程池
        ExecutorService pool2 = Executors.newSingleThreadExecutor();
        //创建一个带有定时器功能的线程池 类似于Timer
        ExecutorService pool3 = Executors.newScheduledThreadPool(1);
    }
}
