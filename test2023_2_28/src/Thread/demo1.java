package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-28 21:02
 **/
public class demo1 {
    private static int sum = 0;
    public static synchronized void func(){
        sum++;
    }
    public static void main (String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run () {
                for (int i = 0 ; i < 5000 ; i++) {
                    func();
                }
            }
        });
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run () {
                for (int i = 0 ; i < 5000 ; i++) {
                    func();
                }
            }
        });
        t.start();
        t1.start();
        t.join();
        t1.join();
        System.out.println(sum);
    }
}
