package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-19 22:58
 **/
class MyBlockingQueue{
    private int[] queue = new int[1000];
    volatile private int tail = 0;
    volatile private int last = 0;
    volatile private int size = 0;

    synchronized public void put(int val) throws InterruptedException {
        if(size == queue.length){
            //阻塞
            this.wait();
        }
        queue[last] = val;
        last++;
        if(last == queue.length) {
            last = 0;
        }
        size++;
        this.notify();
    }

    synchronized public int take() throws InterruptedException {
        if(size == 0){
            //阻塞
            this.wait();
        }
        int key = queue[tail];
        tail++;
        if(tail == queue.length){
            tail = 0;
        }
        size--;
        this.notify();
        return key;
    }
}
public class demo3 {
    public static MyBlockingQueue queue = new MyBlockingQueue();

    public static void main (String[] args) {
        Thread t1 = new Thread(()->{
            int val = 0;
            while(true){
                try {
                    queue.put(val);
                    System.out.println("生产了"+val);
                    val++;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(()->{
            while(true){
                try {
                    int val = queue.take();
                    System.out.println("消费了"+val);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
    }
}
