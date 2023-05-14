package Thread;

/**
 * 写法2：创建一个类并且实现Runnable接口 并且重写run方法 在new Thread时将对象传入
 */
class Myrunnable implements Runnable{
    @Override
    public void run () {
        System.out.println("hello Myrunnable");
    }
}

public class demo3 {
    public static void main (String[] args) {
        Thread t = new Thread(new Myrunnable());
        t.start();
    }
}
