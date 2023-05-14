package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 21:55
 **/
public class demo8 {
    public static void main (String[] args) {
        Thread t1 = new Thread(()-> {
            while(true){
                System.out.println("t1线程执行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t1thread");
        t1.start();
        Thread t2 = new Thread(()-> {
            while(true){
                System.out.println("t2线程执行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t2thread");
        t2.start();
    }
}
