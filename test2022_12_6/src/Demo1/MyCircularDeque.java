package Demo1;

/**
 * 实现双端循环队列
 */
public class MyCircularDeque {
    private int[] qu;
    int lead;
    int tail;
    //构造函数,双端队列最大为 k 。
    public MyCircularDeque(int k) {
        qu=new int[k+1];//创建数组对象 使用数组实现队列 对象可以存储n个
    }
    //将一个元素添加到双端队列头部。 如果操作成功返回 true ，否则返回 false 。
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        lead=(lead-1+qu.length)%qu.length;
        qu[lead]=value;
        return true;
    }
    //将一个元素添加到双端队列尾部。如果操作成功返回 true ，否则返回 false 。
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        qu[tail]=value;
        tail=(tail+1)%qu.length;
        return true;
    }
    //从双端队列头部删除一个元素。 如果操作成功返回 true ，否则返回 false 。
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        lead=(lead+1)%qu.length;
        return true;
    }

    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        tail=(tail-1+qu.length)%qu.length;
        return true;
    }
    //从双端队列头部获得一个元素。如果双端队列为空，返回 -1 。
    public int getFront() {
        if(isEmpty()){
            return -1;
        }else {
            return qu[lead];
        }
    }
    //获得双端队列的最后一个元素。 如果双端队列为空，返回 -1 。
    public int getRear() {
        if(isEmpty()){
            return -1;
        }else {
            return qu[(tail-1+qu.length)%qu.length];
        }
    }
    //若双端队列为空，则返回 true ，否则返回 false  。
    public boolean isEmpty() {
        return tail==lead;
    }
    //若双端队列满了，则返回 true ，否则返回 false 。
    public boolean isFull() {
        if((tail+1)%qu.length==lead){
            return true;
        }
        return false;
    }
}
