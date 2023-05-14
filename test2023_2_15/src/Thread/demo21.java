package Thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 23:25
 **/
//阻塞队列
public class demo21 {
    public static void main (String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        queue.put("hello");
        System.out.println(queue.take());
    }
}
