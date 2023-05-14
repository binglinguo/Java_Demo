package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 23:27
 **/
//生产者消费者模型
class MyBlockingQueue{
    Object block = new Object();//代表锁
    int[] elem = new int[10];//队列数组 可以存放10
    int size = 0;//存放的元素个数
    int head = 0;//队头下标
    int tail = 0;//队尾下标
    //加入一个元素
    public void put(int val) throws InterruptedException {
        synchronized(block){
            if(this.size == this.elem.length){
                block.wait();
            }
            this.elem[this.tail] = val;
            this.tail=(this.tail+1+this.elem.length)%this.elem.length;
            this.size++;
            block.notify();
        }
    }
    //弹出队首元素
    public int task() throws InterruptedException {
        int key = 0;
        synchronized (block){
            if(this.size == 0){
                block.wait();
            }
            key = this.elem[this.head];
            this.head=(this.head+1+this.elem.length)%this.elem.length;
            this.size--;
            block.notify();
        }
        return key;
    }
}
public class demo22 {
    public static void main (String[] args) throws InterruptedException {
        MyBlockingQueue queue = new MyBlockingQueue();
        //生产者模型
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run () {
                for (int i = 0 ; i < 1000 ; i++) {
                    try {
                        queue.put(i);
                        System.out.println("生产者生产了"+ i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run () {
                for (int i = 0 ; i < 1000 ; i++) {
                    try {
                        Thread.sleep(500);
                        System.out.println("消费者消费了"+queue.task());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t2.start();
        t1.join();
        t2.join();
    }
}
