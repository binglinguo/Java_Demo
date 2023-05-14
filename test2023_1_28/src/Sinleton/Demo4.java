package Sinleton;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Demo4 {
    public static void main (String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        //入队列 带阻塞
        queue.put("hello");
        //出队列 带阻塞
        String str = queue.take();
        System.out.println(str);
    }
}
