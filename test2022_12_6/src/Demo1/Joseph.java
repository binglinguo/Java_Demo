package Demo1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 约瑟夫问题2  error
 */
public class Joseph {
    public static int getResult(int n) {
        // write code here
        Queue<Integer> qu1=new LinkedList<>();
        Queue<Integer> qu2=new LinkedList<>();
        for (int i = 1; i <=n ; i++) {
            qu1.offer(i);
        }
        int r=2;
        while(true){
            int fly=1;
            if(!qu1.isEmpty()){
                if(qu1.size()==1){
                    return qu1.peek();
                }
                while(!qu1.isEmpty()){
                    if(fly==1){
                        qu2.offer(qu1.poll());
                    }else{
                        qu1.poll();
                    }
                    fly=fly%r+1;
                }
                Stack<Integer> s=new Stack<>();
                while(!qu2.isEmpty()){
                    s.add(qu2.poll());
                }
                while(!s.isEmpty()){
                    qu1.offer(s.pop());
                }
                if(qu1.size()==1){
                    return qu1.peek();
                }
            }
            r++;
        }

    }

    public static void main(String[] args) {
        int i=getResult(8);
        System.out.println(i);
    }
}
