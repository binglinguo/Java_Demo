package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 22:58
 **/
public class demo17 {
    public static void main (String[] args) {
        Object object = new Object();
        synchronized(object){
            System.out.println("wait 前");
            try {
                object.wait();
                //object.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("wait 后");
        }
    }
}
