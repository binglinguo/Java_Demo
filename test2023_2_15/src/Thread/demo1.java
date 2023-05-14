package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 21:30
 **/
class MyThread extends Thread{
    @Override
    public void run () {
        System.out.println("这是一个线程");
    }
}
public class demo1 {
    public static void main (String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
