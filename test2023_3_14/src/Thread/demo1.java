package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-14 21:52
 **/
class counted{
    private int count = 0;

    public  void add(){
        synchronized(this){
            count++;
        }
    }
    public int get(){
        return count;
    }
}
public class demo1 {
    public static void main (String[] args) throws InterruptedException {
        counted counted = new counted();
        Thread t1 = new Thread(()->{
            for (int i = 0 ; i < 50000 ; i++) {
                counted.add();
            }
        });
        t1.start();
        Thread t2 = new Thread(()->{
            for (int i = 0 ; i < 50000 ; i++) {
                counted.add();
            }
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counted.get());
    }
}
