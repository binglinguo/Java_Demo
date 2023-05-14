package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 21:32
 **/
class MyThread1 extends Thread{
    @Override
    public void run () {
        while(true){
            System.out.println("MyThread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class demo2 {
    public static void main (String[] args) {
        Thread t  = new MyThread1();
        t.start();
        while(true){
            System.out.println("main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
