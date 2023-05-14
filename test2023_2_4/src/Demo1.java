import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-04 19:21
 **/
class MyTask implements Comparable<MyTask>{
    private Runnable runnable;
    private long time;
    public MyTask(Runnable runnable , long after){
        this.runnable = runnable;
        this.time = System.currentTimeMillis() + after;
    }

    public void run (){
        this.runnable.run();
    }
    public long getTime(){
        return this.time;
    }

    @Override
    public int compareTo (MyTask o) {
        return (int)(this.time-o.time);
    }
}
class MyTimer {
    private PriorityBlockingQueue<MyTask> queue = new PriorityBlockingQueue<>();
    private Object loeck = new Object();
    public void schedule(Runnable runnable , long after ){
        MyTask myTask= new MyTask(runnable , after);
        queue.put(myTask);
        synchronized (loeck){
            loeck.notify();
        }
    }
    public MyTimer(){
        Thread thread = new Thread(()->{
            while(true){
                try {
                    MyTask myTask = queue.take();
                    long curTime = System.currentTimeMillis();
                    if(myTask.getTime()>curTime){
                        queue.put(myTask);
                        synchronized (loeck){
                            loeck.wait(myTask.getTime() - curTime );
                        }
                    }else {
                        myTask.run();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
public class Demo1 {
    public static void main (String[] args) {
        MyTimer myTimer = new MyTimer();
        myTimer.schedule(new Runnable() {
            @Override
            public void run () {
                System.out.println("Timer!");
            }
        },3000);
        System.out.println("main");
    }
}

