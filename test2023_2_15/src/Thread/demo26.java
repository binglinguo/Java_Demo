package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-16 22:42
 **/
//线程池
class MyThreadPool{
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
    static class Work extends Thread{
        BlockingQueue<Runnable> queue = null;
        public Work(BlockingQueue<Runnable> queue){
            this.queue = queue;
        }
        @Override
        public void run () {
            while(true){
                try {
                    Runnable runnable = queue.take();
                    runnable.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private List<Work> works = new ArrayList<>();
    public MyThreadPool(int n){
        for (int i = 0 ; i < n ; i++) {
            Work work = new Work(queue);
            work.start();
            works.add(work);
        }
    }
    public void submit(Runnable runnable){
        try {
            queue.put(runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class demo26 {
    public static void main (String[] args) {
        MyThreadPool pool = new MyThreadPool(10);
        for (int i = 0 ; i < 100 ; i++) {
            pool.submit(new Runnable() {
                @Override
                public void run () {
                    System.out.println("hello pool");
                }
            });
        }
    }
}
