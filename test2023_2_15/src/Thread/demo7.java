package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 21:42
 **/
public class demo7 {
    public static final long DEFAULT_LONG = 100_0000_0000l;
    public static void serial(){
        long beg = System.currentTimeMillis();
        int a = 0;
        for (long i = 0 ; i < DEFAULT_LONG ; i++) {
            a++;
        }
        long b = 0;
        for (long i = 0 ; i < DEFAULT_LONG ; i++) {
            b++;
        }
        long begs = System.currentTimeMillis();
        System.out.println("不使用线程消耗的时间："+ (begs - beg));
    }
    public static void threadseiel(){
       long beg = System.currentTimeMillis();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run () {
                int a = 0;
                for (long i = 0 ; i < DEFAULT_LONG ; i++) {
                    a++;
                }
            }
        });
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run () {
                int b = 0;
                for (long i = 0 ; i < DEFAULT_LONG ; i++) {
                    b++;
                }
            }
        });
        t.start();
        t1.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long begs = System.currentTimeMillis();
        System.out.println("使用线程消耗时间" + (begs - beg));
    }
    public static void main (String[] args) throws InterruptedException {
//        serial();
//        threadseiel();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run () {
                serial();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run () {
                threadseiel();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
