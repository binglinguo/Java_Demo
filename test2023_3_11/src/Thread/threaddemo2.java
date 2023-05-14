package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-11 11:05
 **/
//实现Runnable 重写Run
class MyRunnable implements Runnable{
    @Override
    public void run () {
        while(true){
            System.out.println("hello runnable");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class threaddemo2 {
    public static void main (String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();
        while(true){
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
