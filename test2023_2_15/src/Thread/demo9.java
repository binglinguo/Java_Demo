package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 22:00
 **/
public class demo9 {
    public static void main (String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
            for (int i = 0 ; i < 5 ; i++) {
                System.out.println("t1线程");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        //start是启动线程
        t1.run();
        //run只是一个类中的普通方法 只是执行Runnable中的任务 实际运行起来还是只有一条线程
        while(true){
            System.out.println("main线程");
            Thread.sleep(1000);
        }

    }
}
