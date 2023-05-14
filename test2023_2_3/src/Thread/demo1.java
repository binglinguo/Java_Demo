package Thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-03 19:56
 **/
public class demo1 {
    public static void main (String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run () {
                System.out.println("timer");
            }
        },2000);
        System.out.println("main");
    }
}
