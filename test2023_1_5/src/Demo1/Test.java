package Demo1;

public class Test {

    /*
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if(empty())return -1;
        if(!s2.isEmpty()){
            return s2.pop();
        }else {
            while(!s1.isEmpty()){
                 s2.push(s1.pop());
            }
           return s2.pop();
        }
    }

    public int peek() {
        if(empty())return -1;
        if(!s2.isEmpty()){
            return s2.peek();
        }else {
            while(!s1.isEmpty()){
                 s2.push(s1.pop());
            }
           return s2.peek();
        }
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
     */
//    Queue<Integer> qu1;
//    Queue<Integer> qu2;
//
//    public MyStack() {
//        qu1=new LinkedList<>();
//        qu2=new LinkedList<>();
//    }
//
//    public void push(int x) {
//        if(empty()){
//            qu1.offer(x);
//        }else if(!qu1.isEmpty()){
//            qu1.offer(x);
//        }else{
//            qu2.offer(x);
//        }
//    }
//
//    public int pop() {
//        if(empty()){
//            return -1;
//        }
//        if(!qu1.isEmpty()){
//            int size=qu1.size();
//            for(int i=1;i<=size-1;i++){
//                qu2.offer(qu1.poll());
//            }
//            return qu1.poll();
//        }else{
//            int size=qu2.size();
//            for(int i=1;i<=size-1;i++){
//                qu1.offer(qu2.poll());
//            }
//            return qu2.poll();
//        }
//    }
//
//    public int top() {
//        if(empty()){
//            return -1;
//        }
//        if(!qu1.isEmpty()){
//            int size=qu1.size();
//            for(int i=0;i<size-1;i++){
//                qu2.offer(qu1.poll());
//            }
//            int val=qu1.poll();
//            qu2.offer(val);
//            return val;
//        }else{
//            int size=qu2.size();
//            for(int i=0;i<size-1;i++){
//                qu1.offer(qu2.poll());
//            }
//            int val=qu2.poll();
//            qu1.offer(val);
//            return val;
//        }
//    }
//
//    public boolean empty() {
//        return qu1.isEmpty() && qu2.isEmpty();
//    }
}
