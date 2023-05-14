package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 22:19
 **/
public class demo10 {
    public static boolean fly = false;

    public static void main (String[] args) throws InterruptedException {
        Thread t = new Thread(()-> {
            while(!fly){
                System.out.println("t线程执行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        Thread.sleep(5000);
        fly = true;
        System.out.println("已发出终止线程指令");
    }
}
