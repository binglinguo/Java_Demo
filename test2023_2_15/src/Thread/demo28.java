package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-17 10:36
 **/
public class demo28 {
    //带有返回值的任务
    public static void main (String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call () throws Exception {
                int num = 0;
                for (int i = 0 ; i < 100 ; i++) {
                    num++;
                }
                return num;
            }
        } ;
        FutureTask<Integer> task = new FutureTask<>(callable);
        Thread t1 = new Thread(task);
        t1.start();
        t1.join();
        System.out.println(task.get());
    }
}
