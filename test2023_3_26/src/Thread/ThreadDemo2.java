package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-26 21:59
 **/
//基于 Callable 实现 1+2+3+...+1000
public class ThreadDemo2 {
    public static void main (String[] args) throws ExecutionException, InterruptedException {
        //带返回值的
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call () throws Exception {
                int sum = 0;
                for (int i = 1 ; i <= 1000 ; i++) {
                    sum += i;
                }
                return sum;
            }
        };
        FutureTask task = new FutureTask(callable);
        Thread t = new Thread(task);
        t.start();
        System.out.println(task.get());
    }
}
