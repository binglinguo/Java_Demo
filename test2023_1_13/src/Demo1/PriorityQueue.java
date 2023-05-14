package Demo1;

import java.util.Arrays;

public class PriorityQueue {
    public int[] elem;
    public int usedSize;

    public PriorityQueue() {
        this.elem=new int[10];
    }

    /**
     * 建堆的时间复杂度：O(N)
     *
     * @param array
     */
    public void createHeap(int[] array) {
        int len= this.elem.length-1;
        for(int i=(len-1)/2;i >= 0; i--){
            shiftDown(i,len);
        }
    }

    /**
     *
     * @param root 是每棵子树的根节点的下标
     * @param len  是每棵子树调整结束的结束条件
     * 向下调整的时间复杂度：O(logn)
     */
    private void shiftDown(int root,int len) {
        int maxIndex=root*2+1;
        while(maxIndex<len){
            if(maxIndex+1<len && this.elem[maxIndex]<this.elem[maxIndex+1]){
                maxIndex++;
            }
            if(this.elem[root]<this.elem[maxIndex]){
                int t=this.elem[root];
                this.elem[root]=this.elem[maxIndex];
                this.elem[maxIndex]=t;

                root=maxIndex;
                maxIndex=root*2+1;
            }else {
                break;
            }
        }
    }


    /**
     * 入队：仍然要保持是大根堆
     * @param val
     */
    public void push(int val) {
        if(this.usedSize==0){
            this.elem[this.usedSize]=val;
            this.usedSize++;
            return ;
        }else{
            if(isFull()){
                this.elem= Arrays.copyOf(this.elem,this.usedSize+this.usedSize>64?2:this.usedSize>>1);
                push(val);
                return ;
            }else {
                this.elem[this.usedSize]=val;
                int t=this.elem[0];
                this.elem[0]=this.elem[usedSize];
                this.elem[usedSize]=t;
                shiftDown(0,this.usedSize);
                this.usedSize++;
            }
        }
    }

    private void shiftUp(int child) {
        int root=(child-1)/2;
        while(child>0){
            if(this.elem[child]>this.elem[root]){
                int t=this.elem[child];
                this.elem[child]=this.elem[root];
                this.elem[root]=t;
                child=root;
                root=(child-1)/2;
            }else {
                break;
            }
        }
    }

    public boolean isFull() {
        return this.usedSize==this.elem.length;
    }

    /**
     * 出队【删除】：每次删除的都是优先级高的元素
     * 仍然要保持是大根堆
     */
    public void pollHeap() {
        if(isEmpty()){
            return ;
        }

        int t=this.elem[usedSize-1];
        this.elem[usedSize-1]=this.elem[0];
        this.elem[0]=t;
        usedSize--;
    }

    public boolean isEmpty() {
        return this.usedSize==0;
    }

    /**
     * 获取堆顶元素
     * @return
     */
    public int peekHeap() {
        if(isEmpty()){
            return -1;
        }
        return this.elem[0];
    }
}
