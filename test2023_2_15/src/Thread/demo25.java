package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-16 18:19
 **/
public class demo25 {
    public static void main (String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for (int i = 0 ; i < 10 ; i++) {
            pool.submit(new Runnable() {
                @Override
                public void run () {
                    System.out.println("hello threadpool");
                }
            });
        }
    }
}
