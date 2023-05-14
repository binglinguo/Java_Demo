package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 22:27
 **/
public class demo11 {
    public static void main (String[] args) throws InterruptedException {
        Thread t = new Thread(()-> {
            while(!Thread.currentThread().isInterrupted()){
                //currentThread是获取到当前线程的引用
                //isInterrUpted是获取当前线程的状态
                System.out.println("t线程正在执行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    System.out.println("这是收尾工作");
                    break;
                }
            }
        });
        t.start();
        Thread.sleep(5000);
        t.interrupt();//中断线程
    }
}
