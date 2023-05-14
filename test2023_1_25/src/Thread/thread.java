package Thread;

public class thread {
    private static final long count=10_0000_0000l;
    public static void func(){
        int a=0;
        long bag=System.currentTimeMillis();
        for(long i=0;i<count;i++){
            a=a+1;
        }
        int b=0;
        for(long i=0;i<count;i++){
            b=b+1;
        }
        long ben=System.currentTimeMillis();
        System.out.println(ben-bag);
    }
    public static void func1(){
        long beg = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            int a=0;
            for (long i = 0 ; i < count ; i++) {
                a=a+1;
            }
        });
        Thread t2 = new Thread(() -> {
            int b=0;
            for (long i = 0 ; i < count ; i++) {
                b=b+1;
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long ben=System.currentTimeMillis();
        System.out.println(ben-beg);
    }
    public static void main (String[] args) throws InterruptedException {
        //func();
        func1();
    }
}
