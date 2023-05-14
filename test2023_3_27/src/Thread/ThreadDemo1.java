package Thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-27 08:17
 **/
class Mypool{
   BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
    public Mypool(int n){
        Thread t = new Thread(()->{
            for(int i = 0; i < n; i++){
                Thread thread = new Thread(()->{
                    while(true){
                        try {
                            Runnable runnable = queue.take();
                            runnable.run();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        });
        t.start();
    }
    public void submit(Runnable runnable) throws InterruptedException {
        queue.put(runnable);
    }
}
public class ThreadDemo1 {
    public static void main (String[] args) throws InterruptedException {
        Mypool pool = new Mypool(10);
        for(int i = 0; i < 1000 ; i++){
            int ret = i;//注意变量捕获
            Runnable runnable = new Runnable() {
                @Override
                public void run () {
                    System.out.println("hello thread" + ret);
                }
            };
            pool.submit(runnable);
        }
        return;
    }
}
