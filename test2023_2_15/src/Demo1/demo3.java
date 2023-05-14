package Demo1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 17:34
 **/
public class demo3 {
    public static void main (String[] args) {
        //创建线程的新方式 用于线程要进行返回值的时候使用
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call () throws Exception {
                int num = 0;
                for (int i = 0 ; i < 100 ; i++) {
                    num+=i;
                }
                return num;
            }
        };
        //为了让线程能够执行callable中的任务 光构造方法还不够 还需要一个辅助的类
        FutureTask<Integer> task = new FutureTask<>(callable);
        //创建线程去执行任务
        Thread t  = new Thread(task);
        t.start();
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
