package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 12:42
 **/
class Sum{
    public int count = 0;
    synchronized public void add(){
        count++;
    }

}
public class ThreadDemo7 {
    public static void main (String[] args) throws InterruptedException {
        Sum sum = new Sum();
        Thread t1 = new Thread(()->{
            for (int i = 0 ; i < 50000 ; i++) {
                sum.add();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i = 0; i < 50000; i++){
                sum.add();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sum.count);
    }
}
