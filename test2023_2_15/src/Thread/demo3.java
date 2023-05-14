package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 21:36
 **/
class MyRunnable implements Runnable{
    @Override
    public void run () {
        System.out.println("runnable");
    }
}
public class demo3 {
    public static void main (String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
