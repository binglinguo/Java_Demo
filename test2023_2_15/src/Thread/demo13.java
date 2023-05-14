package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 22:42
 **/
public class demo13 {
//    public static void main (String[] args) {
//        Thread t = new Thread(()-> {
//            System.out.println(Thread.currentThread().getName());
//        });
//        t.start();
//        System.out.println(Thread.currentThread().getName());
//    }
public static void main (String[] args) {
    Thread t = new Thread(()-> {
        System.out.println(Thread.currentThread().getName());
    });
    t.start();
    System.out.println(Thread.currentThread().getName());
}
}
