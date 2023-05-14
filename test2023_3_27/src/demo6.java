import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-27 21:26
 **/
class Task {
    Runnable runnable ;
    long time;
    public Task(Runnable runnable,long timer){
        this.runnable = runnable;
        this.time = System.currentTimeMillis() + timer;
    }

}
class MyTimer{
    PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>(10 , new Comparator<Task>() {
        @Override
        public int compare (Task o1 , Task o2) {
            return (int)(o1.time - o2.time);
        }
    });
    Object locker = new Object();
    public MyTimer(){
        Thread t = new Thread(()->{
            synchronized(locker){
                 while(true){
                   try {
                       Task task = queue.take();
                       long time = System.currentTimeMillis();
                       if(task.time <= time){
                           task.runnable.run();
                       }else{
                           queue.put(task);
                           locker.wait();
                       }
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
            }
        });
        t.start();
    }

    public void schedule(Runnable runable,long time ){
        Task task = new Task(runable,time);
        queue.put(task);
        synchronized(locker){
            locker.notify();
        }
    }
}
public class demo6 {
    public static void main (String[] args) throws InterruptedException {
        MyTimer myTimer = new MyTimer();
        myTimer.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("郭炳麟真帅");
            }
        },1000);
        Thread.sleep(1000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("晓伟更帅");
            }
        },500);
        myTimer.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("岳岳超帅");
            }
        },3000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("婧姐最美");
            }
        },1500);
        myTimer.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("冰姐更美");
            }
        },4000);

    }
}
