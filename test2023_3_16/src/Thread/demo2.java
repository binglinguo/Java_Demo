package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-16 22:28
 **/
//使用两个线程来累加 count 的值
public class demo2 {
    public static int count = 0;
    public synchronized static void add(){
        count++;
    }
    public static void main (String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            for (int i = 0 ; i < 10000 ; i++) {
                add();            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0 ; i < 10000 ; i++) {
                add();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
