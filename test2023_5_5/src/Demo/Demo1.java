package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-05-05 21:39
 **/
public class Demo1 {
    public static void main (String[] args) throws InterruptedException {
        Object object = new Object();
        Thread t1 = new Thread(){
            @Override
            public void run () {
                synchronized (object){
                    try{
                        object.wait();
                        System.out.println(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        Thread.sleep(1000);
        Thread t2 = new Thread(){
            @Override
            public void run () {
                synchronized (object){
                       object.notifyAll();
                       System.out.println(2);
                }
            }
        };
        t2.start();
    }
}
