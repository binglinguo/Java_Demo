package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-19 23:09
 **/
public class demo4 {
    public static void main (String[] args) throws InterruptedException {
        for(int i = 0; i < 10 ; i++){
            Thread t1 = new Thread(()->{
                System.out.print("A");
            });
            Thread t2 = new Thread(()->{
                System.out.print("B");
            });
            Thread t3 = new Thread(()->{
                System.out.println("C");
            });
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }
    }
}
