package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 22:39
 **/
public class demo12 {
    public static void main (String[] args) throws InterruptedException {
        Thread t = new Thread(()-> {
            for (int i = 0 ; i < 5 ; i++) {
                System.out.println("t");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        t.join();
    }
}
