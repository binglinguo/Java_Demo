package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 11:09
 **/
//TIMED_WAITING
public class ThreadDemo3 {
    public static void main (String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        Thread.sleep(1);
        //如果不加阻塞 那么我们的主线程执行速度是非常快的
        //会出现线程还未走到休眠已经执行到输出状态了 大概率会输出为RUNNABLE
        System.out.println(t.getState());
    }
}
