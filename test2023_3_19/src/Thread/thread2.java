package Thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-19 22:53
 **/
//生产者消费者模型
public class thread2 {
    public static BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

    public static void main (String[] args) {
        Thread t1 = new Thread(()->{//生产者
            int value = 0;
           while(true){
               try {
                   queue.put(value);
                   System.out.println("生产了 "+ value);
                   value++;
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        });
        t1.start();
        Thread t2 = new Thread(()->{//消费者
            while(true){
                try {
                    int val = queue.take();
                    System.out.println("消费了 "+ val);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
    }

}
