package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-21 17:55
 **/
public class thread {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for(int i=0; i<20; i++){
            final int n = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {//内部类使用外部的变量，必须是final修饰
                    //System.out.println(n);
                    //System.out.println(System.currentTimeMillis());
                }
            });
        }
        for(Thread t : threads){
            t.start();
            System.out.println(System.currentTimeMillis());
        }
        for(Thread t : threads){//同时执行20个线程，再等待所有线程执行完毕
            t.join();
        }
        System.out.println("OK");
    }
}
