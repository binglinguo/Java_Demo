package Demo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-30 23:06
 **/
public class demo3 {
    public static void main (String[] args) {
        demo3 d = new demo3();
        System.out.println(d.getLCA(16 , 7));

    }
    public int getLCA(int a, int b) {
        // write code here
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        a--;//将a转为下标
        b--;//将b转为下标
        while(a > 0){
            queue1.offer(a);
            a = (a - 1)/2;
        }
        queue1.offer(a);
        while(b > 0){
            queue2.offer(b);
            b = (b - 1)/2;
        }
        queue2.offer(b);
        int q1 = queue1.size();
        int q2 = queue2.size();
        if(q1 < q2){
            while((q2 - q1) > 0){
                q2--;
                queue2.poll();
            }
        }else {
            while((q1 - q2) > 0){
                q1--;
                queue1.poll();
            }
        }
        while(!queue1.isEmpty() && !queue2.isEmpty()){
            Integer c1 = queue1.poll();
            Integer c2 = queue2.poll();
            if(c1 == c2){
                return c1 + 1;
            }
        }
        return -1;
    }
}
