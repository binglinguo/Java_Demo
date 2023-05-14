package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 11:27
 **/
public class ThreadDemo5 {
    static Object block = new Object();
    public static void main (String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            synchronized (block){
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t2 = new Thread(()->{
            synchronized (block){
                System.out.println("hello Thread t2");
            }
        });
        t1.start();
        t2.start();
        System.out.println(t2.getState());
    }
}
