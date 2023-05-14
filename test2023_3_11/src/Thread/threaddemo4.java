package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-11 21:24
 **/
//实现Runnable 重写run 使用匿名内部类
public class threaddemo4 {
    public static void main (String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run () {
                while(true){
                    System.out.println("hello thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
        while(true){
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
