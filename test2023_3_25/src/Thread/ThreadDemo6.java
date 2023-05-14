package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 12:31
 **/
public class ThreadDemo6 {
    public static void main (String[] args) {
        Thread t1 = new Thread(()->{

        });
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState());
        t1.start();
    }
}
