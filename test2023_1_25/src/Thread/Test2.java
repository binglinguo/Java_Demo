package Thread;

public class Test2 {
    private static boolean fly=true;
    public static void main (String[] args) {

        Thread t = new Thread(() -> {
            while(fly){
                System.out.println("hello thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程结束");
        fly=false;
    }
}
