package Demo1;
import java.time.LocalDateTime;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/**
 * @Author: guo bing lin
 * @Date: 2023-02-15 09:22
 **/
//读写锁的应用
public class demo1 {
    public static void main(String[] args) {
        //创建读写锁
        final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        //创建读锁
        final ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();
        //创建写锁
        final ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();
        //创建线程池
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5,5,0,
                TimeUnit.SECONDS,new LinkedBlockingQueue<>());

        //线程池执行任务1【读操作】
        threadPool.submit(()->{
            //加锁操作
            readLock.lock();
            try {
                System.out.println("执行读锁1："+ LocalDateTime.now());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                readLock.unlock();
            }
        });

        //线程池执行任务2【读操作】
        threadPool.submit(()->{
            //加锁操作
            readLock.lock();
            try {
                System.out.println("执行读锁2："+ LocalDateTime.now());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                readLock.unlock();
            }
        });

        //线程池执行任务3【写操作】
        threadPool.submit(()->{
            //加锁操作
            writeLock.lock();
            try {
                System.out.println("执行写锁1："+ LocalDateTime.now());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                writeLock.unlock();
            }
        });

        //线程池执行任务4【写操作】
        threadPool.submit(()->{
            //加锁操作
            writeLock.lock();
            try {
                System.out.println("执行写锁2："+ LocalDateTime.now());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                writeLock.unlock();
            }
        });
    }
}
