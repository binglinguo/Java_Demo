package Thread;

public class Demo2 {
    public static void main (String[] args) throws InterruptedException {
        Thread t = new Thread(() ->{

        });
        t.start();
        Thread.sleep(1000);
        System.out.println(t.getState());
    }
}
