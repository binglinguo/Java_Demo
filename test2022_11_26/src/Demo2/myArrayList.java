package Demo2;

import java.util.Arrays;

public class myArrayList {

    public int[] elem;
    public int usedSize;//0
    //默认容量
    private static final int DEFAULT_SIZE = 5;

    public myArrayList() {
        this.elem = new int[DEFAULT_SIZE];
    }

    /**
     * 打印顺序表:
     * 根据usedSize判断即可
     */
    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    // 新增元素,默认在数组最后新增
    public void add(int data) {
        if(isFull()){
            this.elem= Arrays.copyOf(elem,this.elem.length*2);
        }
        this.elem[this.usedSize]=data;
        this.usedSize++;
    }

    /**
     * 判断当前的顺序表是不是满的！
     *
     * @return true:满   false代表空
     */
    public boolean isFull() {
//        if(this.usedSize==this.elem.length){
//            return true;
//        }
//        return false;
        return this.usedSize==this.elem.length;
    }

    //判断下标位置是否合法
    private boolean checkPosInAdd(int pos) {
        if(pos<0||pos>usedSize){
            return false;
        }
        return true;//合法
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(!checkPosInAdd(pos)){
            throw new ArraysListException("下标不合法！");
        }
        if(isFull()){
            this.elem= Arrays.copyOf(elem,this.elem.length*2);
        }
        for (int i = this.usedSize; i > pos ; i--) {
            this.elem[i]=this.elem[i-1];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i]==toFind){
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
        if(pos<0||pos>=usedSize){
            throw new ArraysListException("下标不合法！");
        }
        return this.elem[pos];
    }

    private boolean isEmpty() {
        return this.usedSize==0;
    }

    // 给 pos 位置的元素设为【更新为】 value
    public void set(int pos, int value) {
        if(!checkPosInAdd(pos)){
            throw new ArraysListException();
        }
        this.elem[pos]=value;
        if(pos==this.usedSize){
            this.usedSize++;
        }
    }

    /**
     * 删除第一次出现的关键字key
     *
     * @param key
     */
    public void remove(int key) {
        int n=indexOf(key);
        for (int i = n; i < usedSize-1; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
//        for (int i = 0; i < usedSize; i++) {
//            this.elem[i]=0;
//        }
//        usedSize=0;
        this.usedSize=0;
    }
}