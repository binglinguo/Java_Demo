package Thread;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-14 22:05
 **/
public class demo3 {
    public static void main (String[] args) throws InterruptedException {
        Thread t0 = new Thread(()->{
            System.out.print(0+" ");
        });

        Thread t1 = new Thread(()->{
            System.out.print(1+" ");
        });

        Thread t2 = new Thread(()->{
            System.out.print(2+" ");
        });

        Thread t3 = new Thread(()->{
            System.out.print(3+" ");
        });

        Thread t4 = new Thread(()->{
            System.out.print(4+" ");
        });

        Thread t5 = new Thread(()->{
            System.out.print(5+" ");
        });

        Thread t6 = new Thread(()->{
            System.out.print(6+" ");
        });

        Thread t7 = new Thread(()->{
            System.out.print(7+" ");
        });

        Thread t8 = new Thread(()->{
            System.out.print(8+" ");
        });

        Thread t9 = new Thread(()->{
            System.out.print(9+" ");
        });

        Thread t10 = new Thread(()->{
            System.out.print(10+" ");
        });

        Thread t11 = new Thread(()->{
            System.out.print(11+" ");
        });

        Thread t12 = new Thread(()->{
            System.out.print(12+" ");
        });

        Thread t13 = new Thread(()->{
            System.out.print(13+" ");
        });

        Thread t14 = new Thread(()->{
            System.out.print(14+" ");
        });

        Thread t15 = new Thread(()->{
            System.out.print(15+" ");
        });

        Thread t16 = new Thread(()->{
            System.out.print(16+" ");
        });

        Thread t17 = new Thread(()->{
            System.out.print(17+" ");
        });

        Thread t18 = new Thread(()->{
            System.out.print(18+" ");
        });

        Thread t19 = new Thread(()->{
            System.out.print(19+" ");
        });
        t0.join();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();
        t11.join();
        t12.join();
        t13.join();
        t14.join();
        t15.join();
        t16.join();
        t17.join();
        t18.join();
        t19.join();
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
        System.out.println("ok");
    }
}
