package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 22:47
 **/
class Counter{
    private volatile int count = 0;
    public synchronized void countAdd(){
        count++;
    }
    public int setCount(){
        return count;
    }
}
public class demo15 {
    public static void main (String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(()-> {
            for (int i = 0 ; i < 50000 ; i++) {
                counter.countAdd();
            }
        });
        t1.start();
        Thread t2 = new Thread(()-> {
            for (int i = 0 ; i < 50000 ; i++) {
                counter.countAdd();
            }
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.setCount());
    }
}
