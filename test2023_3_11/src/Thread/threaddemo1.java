package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-11 09:27
 **/
//继承Thread 重写run
class MyThread extends Thread{
    @Override
    public void run () {
        while(true)
        System.out.println("hello,world!");
    }
}
public class threaddemo1 {

    public static void main (String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        t.join();
    }
}
