package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 15:19
 **/
public class ThreadDemo8 {
    static boolean flg = true;
    static Object block = new Object();
    public static void main (String[] args) {
        Thread t1 = new Thread(()->{
            while(flg){
                synchronized (block){
                    if(!flg){
                        System.out.println(1);
                        break;
                    }
                }
            }
            System.out.println("线程1结束");
        });
        t1.start();
        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(3000);
                flg = false;
                System.out.println("线程1循环停止");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t2.start();
    }
}
