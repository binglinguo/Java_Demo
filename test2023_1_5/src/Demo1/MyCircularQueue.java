package Demo1;

public class MyCircularQueue {
    /**
     * 设计循环队列
     */
    private int[] elem;
    private int left;
    private int right;
    public MyCircularQueue(int k) {
        elem=new int[k+1];
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        elem[right]=value;
        right=(right+1)%elem.length;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        left=(left+1)%elem.length;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return elem[left];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return elem[((right-1)+elem.length)%elem.length];
    }

    public boolean isEmpty() {
        return left==right;
    }

    public boolean isFull() {
        return (right+1)%elem.length==left;
    }
}
