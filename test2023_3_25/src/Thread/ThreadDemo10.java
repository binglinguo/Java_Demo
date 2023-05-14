package Thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 22:25
 **/
class Worker{
    //我们使用一个阻塞队列来组织任务
    BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(100);
    //为了保证线程一直会执行 我们直接在构造方法中实现
    public Worker(int n){
        Thread t = new Thread(()-> {
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
    public void submit(Runnable runnable){
        try {
            queue.put(runnable);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ThreadDemo10 {
    public static void main (String[] args) {
        Worker worker = new Worker(10);
        for (int i = 0 ; i < 10000 ; i++) {
            int n = i;//此处要注意变量捕获的问题
            worker.submit(new Runnable() {
                @Override
                public void run () {
                    System.out.println("hello thread t" + n);
                }
            });
        }
    }
}
