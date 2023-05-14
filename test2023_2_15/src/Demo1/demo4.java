package Demo1;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-16 22:27
 **/
class MyTask implements Comparable<MyTask>{
    private Runnable runnable;
    private long time;

    public MyTask(Runnable runnable,long after){
        this.runnable = runnable;
        this.time = System.currentTimeMillis() + after;
    }

    public void run(){
        this.runnable.run();
    }

    public long getTime(){
        return this.time;
    }

    @Override
    public int compareTo (MyTask o) {
        return (int)(this.getTime() - o.getTime());
    }
}
class MyTimer{
    Object lock = new Object();
    PriorityBlockingQueue<MyTask> minHeap = new PriorityBlockingQueue<>();
    public void schedule(Runnable runnable,long after){
        MyTask myTask = new MyTask(runnable,after);
        minHeap.put(myTask);
        lock.notify();
    }
    public MyTimer(){

        Thread t = new Thread(()->{
            while(true){
                try {
                    MyTask top = minHeap.take();
                    if(top.getTime() < System.currentTimeMillis()) {
                        minHeap.put(top);
                        lock.wait(top.getTime() - System.currentTimeMillis());
                    }else {
                        top.run();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }
}
public class demo4 {
    public static void main (String[] args) {
        Timer timer = new Timer();//计时器
        timer.schedule(new TimerTask() {//放入定时任务
            @Override
            public void run () {
                System.out.println("timer1");
            }
        },3000);
        timer.schedule(new TimerTask() {//放入定时任务
            @Override
            public void run () {
                System.out.println("timer2");
            }
        },2000);
        timer.schedule(new TimerTask() {//放入定时任务
            @Override
            public void run () {
                System.out.println("timer3");
            }
        },5000);
        System.out.println("main");
    }
}
