package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 11:21
 **/
//WAITING
public class ThreadDemo4 {
    static Object block = new Object();
    public static void main (String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            while(true){
                synchronized(block){
                    try {
                        block.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
        Thread.sleep(10);
        System.out.println(t.getState());
    }
}
