package Demo1;

import java.util.Arrays;

/**
 * 优先级队列的实现（优先级 顾名思义是以一个标准来进行优先化）
 */
public class TestHeap {

    int[] elem;
    int usedSize;
    public TestHeap(){
        this.elem=new int[10];
    }

    /**
     * 判断堆是否为空
     * @return
     */
    public boolean isEmpty(){
        return this.usedSize==0;
    }

    /**
     * 堆排序
     */
    public void HeapSort(){
        int parend=this.usedSize-1;
        while(0!=parend){
            int tmp=this.elem[0];
            this.elem[0]=this.elem[parend];
            this.elem[parend]=tmp;
            parend--;
            //shiftDown(0);//向下调整

        }
    }

    /**
     * 返回堆顶元素
     * @return
     */
    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("优先级队列为空！");
        }
        return this.elem[0];
    }

    /**
     * 弹出堆顶元素
     * @return
     * @throws Exception
     */
    public int poll() throws Exception {
        if(isEmpty()){
            throw new RuntimeException("优先级队列为空!");
        }
        int ret=this.elem[0];
        this.usedSize--;
        this.elem[0]=this.elem[this.usedSize-1];
        int n=0;
        int parent=n*2+1;
        while(n<this.usedSize-1){
            if(this.elem[n]<this.elem[parent]){
                int tmp=this.elem[n];
                this.elem[n]=this.elem[parent];
                this.elem[parent]=tmp;
                n=parent;
                parent=n*2+1;
            }
            else {
                break;
            }
        }
        return ret;
    }

    /**
     * 向下调整
     * @param tail
     */
    private void shiftUp(int tail){
        int parent=(tail-1)/2;
        while(parent>0){
            if(this.elem[tail]>this.elem[parent]){
                int tmp=this.elem[tail];
                this.elem[tail]=this.elem[parent];
                this.elem[parent]=tmp;
                tail=parent;
                parent=(parent-1)/2;
            }else {
                break;
            }
        }
    }

    /**
     * 入堆
     * @param val
     */
    public void offer(int val){
        if(isFull()){
            this.elem= Arrays.copyOf(this.elem,this.elem.length*2);
        }
        this.elem[this.usedSize]=val;
        this.usedSize++;
        shiftUp(this.usedSize-1);
    }

    /**
     * 判断堆是否已满
     * @return
     */
    public boolean isFull(){
        return this.usedSize==this.elem.length;
    }
}