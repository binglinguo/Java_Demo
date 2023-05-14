package Demo1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 最近的请求次数
 */
public class RecentCounter {
    Queue<Integer> qu;
    public RecentCounter() {
        qu=new LinkedList<Integer>();
    }

    public int ping(int t) {
        while(!qu.isEmpty()&&qu.peek()<t-3000){
            qu.poll();
        }
        qu.offer(t);
        return qu.size();
    }
}
