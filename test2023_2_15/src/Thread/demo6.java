package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 21:40
 **/
public class demo6 {
    public static void main (String[] args) {
        Thread t = new Thread(()-> {
            System.out.println("main");
        });
        t.start();
    }
}
