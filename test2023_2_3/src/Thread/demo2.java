package Thread;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-03 20:13
 **/
class MyTask implements Comparable<MyTask>{
    //描述了一个任务
    private Runnable runnable;
    //描述了一个时间戳
    private long time;

    public MyTask (Runnable runnable , long after) {
        this.runnable = runnable;
        this.time = System.currentTimeMillis() + after;
    }

    public void run(){
        runnable.run();
    }

    public long getTime(){
        return time;
    }

    @Override
    public int compareTo (MyTask o) {
        return (int)(this.time-o.time);
    }
}
class MyTimer {
    private PriorityBlockingQueue<MyTask> queue = new PriorityBlockingQueue<>();

    public void schedule(Runnable runnable,long after){
        MyTask myTask = new MyTask(runnable,after);
        queue.put(myTask);
        synchronized (loeck){
            loeck.notify();
        }
    }

    private Object loeck = new Object();
   public MyTimer(){
        Thread thread = new Thread(()->{
            while(true){
                try {
                    MyTask myTask = queue.take();
                    long curTime = System.currentTimeMillis();
                    if(curTime<myTask.getTime()){
                        queue.put(myTask);
                        synchronized(loeck){
                            loeck.wait(myTask.getTime()-curTime);
                        }
                    }else {
                        myTask.run();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
//       Thread thread = new Thread(()->{
//           while(true){
//               MyTask myTask = queue.peek();
//               long curTime = System.currentTimeMillis();
//               if(curTime >= myTask.getTime()){
//                   myTask.run();
//                   try {
//                       queue.take();
//                   } catch (InterruptedException e) {
//                       e.printStackTrace();
//                   }
//               }
//           }
//
//       });
        thread.start();
   }


}
public class demo2 {
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
