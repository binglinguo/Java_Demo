package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 21:39
 **/
public class demo5 {
    public static void main (String[] args) {
        Thread t  = new Thread(new Runnable() {
            @Override
            public void run () {
                System.out.println();
            }
        });
        t.start();
    }
}
