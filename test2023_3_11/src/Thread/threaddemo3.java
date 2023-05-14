package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-11 18:41
 **/
//继承Thread 重写run 使用匿名内部类
public class threaddemo3 {
    public static void main (String[] args) {
        Thread t = new Thread(){
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
        };
        t.start();
        while(true){
            System.out.println("hello mian");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
