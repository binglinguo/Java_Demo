import javafx.concurrent.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-06 19:55
 **/
class MyThreadPool{
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

    static class Worker extends Thread{
        private BlockingQueue<Runnable> queue = null;
        public Worker(BlockingQueue<Runnable> queue){
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
    private List<Thread> workers = new ArrayList<>();

    public MyThreadPool(int n){
        for (int i = 0 ; i < n ; i++) {
            Worker worker = new Worker(queue);
            worker.start();
            this.workers.add(worker);
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
public class Demo1 {
    public static void main (String[] args) {
        MyThreadPool myThreadPool = new MyThreadPool(10);
        for (int i = 0 ; i < 100 ; i++) {
            myThreadPool.submit(new Runnable() {
                @Override
                public void run () {
                    System.out.println("hello threadpool");
                }
            });
        }

    }
}
