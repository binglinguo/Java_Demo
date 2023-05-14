package Thread;

import javax.accessibility.Accessible;
import java.util.concurrent.Semaphore;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-17 10:56
 **/
public class demo30 {
    public static void main (String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(4);
        semaphore.acquire();
        System.out.println("申请成功1");
        semaphore.acquire();
        System.out.println("申请成功2");
        semaphore.acquire();
        System.out.println("申请成功3");
        semaphore.acquire();
        System.out.println("申请成功4");
        semaphore.release();
        System.out.println("释放成功1");
        semaphore.acquire();
        System.out.println("申请成功5");

    }
}
