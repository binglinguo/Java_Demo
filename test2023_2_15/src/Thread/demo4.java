package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 21:37
 **/
public class demo4 {
    public static void main (String[] args) {
        Thread t = new Thread(){
            @Override
            public void run () {
                System.out.println("main");
            }
        };
        t.start();
    }
}
