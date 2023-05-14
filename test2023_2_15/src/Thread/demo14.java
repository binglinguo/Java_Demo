package Thread;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 22:45
 **/
public class demo14 {
    public static void main (String[] args) {
        Thread t = new Thread(()-> {
            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        System.out.println(t.getState());
    }
}
