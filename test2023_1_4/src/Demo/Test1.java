package Demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test1 {
    Queue<Integer> qu1=new LinkedList<>();
    Queue<Integer> qu2=new LinkedList<>();
    public void push(int x) {
        if(!qu1.isEmpty()) {
            qu1.offer(x);
        } else if (!qu2.isEmpty()) {
            qu2.offer(x);
        }else {
            qu1.offer(x);
                }
        }
        public int pop() {
            if(!qu1.isEmpty()){
                int size=qu1.size();
                for(int i=0;i<size-1;i++){
                    qu2.offer(qu1.poll());
                }
                return qu1.poll();
            }else if(!qu2.isEmpty()){
                int size=qu2.size();
                for(int i=0;i<size-1;i++){
                    qu1.offer(qu2.poll());
                }
                return qu2.poll();
            }else {
                return -1;
        }
    }
}
