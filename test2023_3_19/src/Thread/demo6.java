package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-19 23:22
 **/
public class demo6 {
    public static Object blockA = new Object();//A的线程锁
    public static Object blockB = new Object();//B的线程锁
    public static Object blockC = new Object();//C的线程锁
    public static void main (String[] args) throws InterruptedException {
        Thread a = new Thread(()->{
            for(int i = 0 ; i < 10 ; i++){
                synchronized(blockA){
                    try {
                        blockA.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("A");
                synchronized (blockB){
                    blockB.notify();
                }
            }
        });
        Thread b = new Thread(()->{
            for (int i = 0 ; i < 10 ; i++) {
                synchronized(blockB){
                    try {
                        blockB.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("B");
                synchronized(blockC){
                    blockC.notify();
                }
            }
        });
        Thread c = new Thread(()->{
            for (int i = 0 ; i < 10 ; i++) {
                synchronized (blockC){
                    try {
                        blockC.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("C");
                synchronized (blockA){
                    blockA.notify();
                }
            }
        });
        a.start();
        b.start();
        c.start();
        Thread.sleep(1);
        //Thread.yield();
        synchronized(blockA){
            blockA.notify();
        }
    }
}
