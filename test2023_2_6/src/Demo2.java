import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-06 21:03
 * 定时器练习
 **/
class MyThread implements Comparable<MyThread>{
    private Runnable runnable;
    private long time;

    public MyThread(Runnable runnable,long after){
        this.runnable = runnable;
        this.time = System.currentTimeMillis() + after;
    }

    public long getTime(){
        return this.time;
    }

    @Override
    public int compareTo (MyThread o) {
        return (int) (this.time - o.time);
    }

    public void run(){
        runnable.run();
    }
}
class MyQueue{
    private PriorityBlockingQueue<MyThread> queue = new PriorityBlockingQueue<>();
    private Object loeck = new Object();
    public void schedule(Runnable runnable,long after){
        MyThread myThread = new MyThread(runnable,after);
        queue.put(myThread);
        synchronized (loeck){
            loeck.notify();
        }
    }
    public MyQueue(){
        Thread thread = new Thread(()->{
            while(true){
                try {
                    MyThread myThread = queue.take();
                    long newTime = System.currentTimeMillis();
                    if(newTime < myThread.getTime()){
                        queue.put(myThread);
                        long time = myThread.getTime()-newTime;
                        synchronized(loeck){
                            loeck.wait(time);
                        }
                    }else {
                        myThread.run();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
public class Demo2 {
    public static void main (String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("hello Thread Time1");
            }
        },3000);
        System.out.println("hello main");
        myQueue.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("hello Thread Time2");
            }
        },2000);
        myQueue.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("hello Thread Time3");
            }
        },2999);
    }
}
