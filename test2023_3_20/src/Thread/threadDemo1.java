package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-20 08:21
 **/
public class threadDemo1 {
    public static Object blockA = new Object();
    public static Object blockB = new Object();
    public static Object blockC = new Object();
    public static void main (String[] args) throws InterruptedException {
           Thread A = new Thread(()->{
               for (int i = 0 ; i < 10 ; i++) {
                   synchronized(blockA){
                       try {
                           blockA.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                   System.out.print("A");
                   synchronized(blockB){
                       blockB.notify();
                   }
               }
           });
           Thread B = new Thread(()->{
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
           Thread C = new Thread(()->{
               for (int i = 0 ; i < 10 ; i++) {
                   synchronized(blockC){
                       try {
                           blockC.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                   System.out.println("C");
                   synchronized(blockA){
                       blockA.notify();
                   }
               }
           });
           A.start();
           B.start();
           C.start();
           Thread.sleep(1000);
           synchronized(blockA){
               blockA.notify();
           }
    }
}
