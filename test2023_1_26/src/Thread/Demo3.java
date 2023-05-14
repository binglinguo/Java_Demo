package Thread;

public class Demo3 {
    public static void main (String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while(true){

            }
        });
        t.start();
        Thread.sleep(1000);
        System.out.println(t.getState());
    }
}
