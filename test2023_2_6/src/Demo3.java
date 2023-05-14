import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-06 21:32
 **/
class Mytask implements Comparable<Mytask>{
    private Runnable runnable;
    private long time;
    public Mytask(Runnable runnable,long after){
        this.runnable = runnable ;
        this.time = System.currentTimeMillis() + after ;
    }

    public void run(){
        runnable.run();
    }

    public long getTime(){
        return this.time;
    }

    @Override
    public int compareTo (Mytask o) {
        return (int) (this.time - o.time);
    }
}
class Timer{
    private PriorityBlockingQueue<Mytask> queue = new PriorityBlockingQueue<>();
    private Object loeck = new Object();
    public void schedule(Runnable runnable,long after){
        Mytask mytask = new Mytask(runnable,after);
        queue.put(mytask);
        synchronized (loeck){
            loeck.notify();
        }
    }
    public Timer(){
        try {
            Mytask task = queue.take();
            long time = System.currentTimeMillis();
            if(time < task.getTime()){
                queue.put(task);
                synchronized(loeck){
                    loeck.wait(task.getTime() - time);
                }
            }else {
                task.run();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Demo3 {
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
