package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-21 22:33
 **/
//实现阻塞队列
class MyBlockingQueue{
    private int[] array;
    private volatile int tail = 0;
    private volatile int last = 0;
    private volatile int size = 0;

    public MyBlockingQueue(int n){
        array = new int[n];
    }

    synchronized public void put(int val) throws InterruptedException {
        if(size == array.length){
           while(size == array.length){
               this.wait();
           }
        }
        array[last] = val;
        last++;
        if(last == array.length){
            last = 0;
        }
        size++;
        this.notify();
    }

    synchronized public int take() throws InterruptedException {
        if(size == 0) {
            while(size == 0){
                this.wait();
            }
        }
        int ret = array[tail];
        tail++;
        if(tail == array.length){
            tail = 0;
        }
        size--;
        this.notify();

        return ret;
    }

}
public class Threaddemo1 {
    public static void main (String[] args) {
        MyBlockingQueue queue = new MyBlockingQueue(10);
        //实现一个生产者消费者模型
        Thread t1 = new Thread(()->{//消费者模型
            while(true){
                try {
                    int ret = queue.take();
                    System.out.println("消费 "+ ret);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(()->{//生产者模型
            int value = 0;
            while(true){
                try {
                    System.out.println("生产 "+ value);
                    queue.put(value);

                    value++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
    }
}
