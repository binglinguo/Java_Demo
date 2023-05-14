package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-25 10:51
 **/
//线程NEW状态
public class ThreadDemo1 {
    public static void main (String[] args) {
        Thread t = new Thread(()->{
            System.out.println("hello Thread");
        });
        System.out.println(t.getState());
    }
}
