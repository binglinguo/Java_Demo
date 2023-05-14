package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 10:57
 **/
//RUNNABLE
public class ThreadDemo2 {
    public static void main (String[] args) throws InterruptedException {
        Thread t = new Thread(()->{
            while(true){
            }
        });
        t.start();
        System.out.println(t.getState());
    }
}
