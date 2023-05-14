package Thread;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-21 22:53
 **/
//编写代码, 实现定时器案例
class MyBask implements Comparable<MyBask>{
    Runnable runnable;
    long time;
    public MyBask(Runnable runnable,long bolre){
        this.runnable = runnable;
        this.time = System.currentTimeMillis() + bolre;
    }

    @Override
    public int compareTo (MyBask o) {
        return (int)(this.time - o.time);
    }
}
class MyTimer{
    private Object block = new Object();
    private PriorityBlockingQueue<MyBask> queue = new PriorityBlockingQueue<>();
    public void schedule(Runnable runnable,long blore){
        MyBask bask = new MyBask(runnable,blore);
        queue.put(bask);
        synchronized (block){
            block.notify();
        }
    }
    public MyTimer(){
        Thread t = new Thread(()->{
            while(true){
                synchronized (block) {
                    try {
                        MyBask bask= queue.take();
                        long time = System.currentTimeMillis();
                        if(time >= bask.time){
                            bask.runnable.run();
                        }else {
                            queue.put(bask);
                            synchronized (block){
                                block.wait(bask.time - time);
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }
}
public class ThreadDemo2 {
    public static void main (String[] args) {
        MyTimer myTimer = new MyTimer();
        myTimer.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("main1");
            }
        },1000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("main2");
            }
        },2000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("main3");
            }
        },3000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("main4");
            }
        },4000);
        System.out.println("main0");
    }
}
