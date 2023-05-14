import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-06 21:44
 **/
class MyThreadpool{
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
    static class worder extends Thread{
        private BlockingQueue<Runnable> queue = null;
        public worder(BlockingQueue<Runnable> queue){
            this.queue = queue;
        }
        @Override
        public void run () {
            while(true){

            }
        }
    }
}
public class Demo4 {
}
