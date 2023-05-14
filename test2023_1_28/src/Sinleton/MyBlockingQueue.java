package Sinleton;

/**
 * 案例1  实现生产者消费者模式
 * 如果要保证是一个安全的线程
 * 1.实现一个普通队列
 * 2.加锁 synchronized
 * 3.加上阻塞
 */
class MyIsBlockingQueue{
    private int[] elem = new int[100];
    private int size = 0;
    private int head = 0;
    private int tail = 0;
    private Object loeck= new Object();//线程锁
    //入队列
    public void put(int val) throws InterruptedException {
        synchronized(loeck){//线程安全锁
            if(this.size==this.elem.length){
                //阻塞
                loeck.wait();
            }
            //入队列
            this.elem[this.tail]=val;
            this.tail++;
            if(this.tail == this.elem.length){
                this.tail = 0;
            }
            this.size++;
            loeck.notify();
        }
    }
    //出队列
    public int take() throws InterruptedException {
        synchronized(loeck){//线程安全锁
            if(this.size==0){
                //阻塞
                loeck.wait();
            }
            int ret=this.elem[this.head];
            this.head++;
            if(this.head==this.elem.length){
                this.head=0;
            }
            size--;
            loeck.notify();
            return ret;
        }
    }
}

public class MyBlockingQueue {
    public static void main (String[] args) {
        MyIsBlockingQueue queue = new MyIsBlockingQueue();
        //生产者t1
        Thread t1 = new Thread(() -> {
            int i=0;
            while(true){
                try {
                    //Thread.sleep(500);
                    queue.put(i);
                    System.out.println("生产者生产了："+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        });
        t1.start();//启动线程
        //消费者 t2
        Thread t2 = new Thread(() -> {
            while(true){
                try {
                    Thread.sleep(500);
                    int ret=queue.take();
                    System.out.println("消费者消费了："+ret);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
    }
//    public static void main1 (String[] args) {
//        MyIsBlockingQueue queue = new MyIsBlockingQueue();
//        queue.put(1);
//        queue.put(2);
//        queue.put(3);
//        queue.put(4);
//        int ret=0;
//        ret=queue.take();
//        System.out.println(ret);
//        ret=queue.take();
//        System.out.println(ret);
//        ret=queue.take();
//        System.out.println(ret);
//        ret=queue.take();
//        System.out.println(ret);
//    }
}
