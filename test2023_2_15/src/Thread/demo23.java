package Thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-16 17:14
 **/
public class demo23 {
    public static void main (String[] args) {
        Timer timer = new Timer();//计时器
        timer.schedule(new TimerTask() {//放入定时任务
            @Override
            public void run () {
                System.out.println("timer");
            }
        },3000);
        System.out.println("main");
    }
}
