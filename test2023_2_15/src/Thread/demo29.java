package Thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-17 10:47
 **/
public class demo29 {
    public static void main (String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();

        lock.unlock();
        System.out.println("1");
    }
}
