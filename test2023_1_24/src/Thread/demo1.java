package Thread;

/**
 * 写法1 创建一个类并继承Thread类 并且重写run方法
 */
class Mythread extends Thread{
    @Override
    public void run () {
        System.out.println("Hello Thread");
    }
}

public class demo1 {
    public static void main (String[] args) {
        Thread thread=new Mythread();
        thread.start();
    }
}
