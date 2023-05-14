package Demo1;

/**
 * 设计循环队列
 */
public class MyCircularQueue {
    int[] queue;
    int lead;//队头
    int tail;//队尾
    public MyCircularQueue(int k) {
        queue=new int[k+1];
    }
    //向循环队列插入一个元素。如果成功插入则返回真
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        queue[tail]=value;
        tail=(tail+1)%queue.length;
        return true;
    }
    //从循环队列中删除一个元素。如果成功删除则返回真
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        lead=(lead+1)%queue.length;
        return true;
    }
    //从队首获取元素。如果队列为空，返回 -1
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return queue[lead];
    }
    //获取队尾元素。如果队列为空，返回 -1
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return queue[(tail-1+queue.length)%queue.length];
    }
    //检查循环队列是否为空
    public boolean isEmpty() {
        return lead==tail;
    }
    //检查循环队列是否已满
    public boolean isFull() {
        return (tail+1)%queue.length==lead;
    }
}
