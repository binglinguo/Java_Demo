package Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-24 22:00
 **/
class MyThreadPool{
    BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
    public void submit(Runnable runnable) throws InterruptedException {
        queue.put(runnable);
    }
    public MyThreadPool(){
        Thread t = new Thread(()->{
            while(true){
                    Thread t1 = new Thread(()->{
                        try {
                            Runnable runnable = queue.take();
                            runnable.run();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                    t1.start();
            }
        });
        t.start();
    }
}
public class ThreadPool {
    public static void main (String[] args) throws InterruptedException {
        MyThreadPool myThreadPool = new MyThreadPool();
        for(int i = 0 ; i < 1000 ; i++){
            int t = i;
            myThreadPool.submit(new Runnable() {
                @Override
                public void run () {
                    System.out.println("执行线程" + t);
                }
            });
        }
    }
}
