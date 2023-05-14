

import java.util.Arrays;
/**
 * 顺序表
 */


    /*public int[] arr;
    public int count;

    public SeqList(){
        this.arr=new int[10];
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i <this.count ; i++) {
            System.out.print(this.arr[i]+" ");
        }
        System.out.println();
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(pos<0||pos>this.count) {
            System.out.println("坐标不合法");
            return;
        }
        //扩容
        if(this.arr.length==this.count){
            this.arr=Arrays.copyOf(this.arr,this.arr.length*2);
        }
        for (int i = count-1; i >=pos ; i--) {
            this.arr[i+1]=this.arr[i];
        }
        this.arr[pos]=data;
        this.count++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.count; i++) {
            if(this.arr[i]==toFind){
                return true;
            }
        }
        return false; }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i <this.count ; i++) {
            if(this.arr[i]==toFind){
                return i+1;
            }
        }
        return -1; }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos>=0&&pos<=this.count){
            return this.arr[pos];
        }
        return -1; }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        this.arr[pos]=value;

    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        for (int i = 0; i <this.count ; i++) {
            if(this.arr[i]==toRemove) {
                for (int j = i; j < this.count - 1; j++) {
                    this.arr[j] = this.arr[j+ 1];
                }
                this.count--;
                return;
            }
        }
        System.out.println("没有找到要删除的数字");

    }
    // 获取顺序表长度
    public int size() {
        if(count>0)
            return this.count;
        return 0; }
    // 清空顺序表
    public void clear() {
        this.count=0;
    }*/

    /**
     * 顺序表
     */
    public class SeqList {
    public int[] elem;
    public int elemSize;
    public  SeqList(){
        this.elem=new int[10];
    }
    // 打印顺序表
    public void display() {
        for (int i = 0; i <this.elemSize ; i++) {
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //1.判断pos位置的合法性
        if(pos<0||pos>this.elemSize){
            System.out.println("pos 位置不合法");
            return;
        }
        //2.如果存放大小不够进行扩容
        if(ispos(pos)){
            this.elem=Arrays.copyOf(this.elem,this.elem.length*2);
        }
        //3.移动元素
        for (int i = this.elemSize-1; i >pos ; i--) {
                elem[i+1]=elem[i];
        }
        this.elem[pos]=data;
        this.elemSize++;
    }
    //判断是否需要扩容
    public boolean ispos(int pos){
        if(this.elemSize==pos){
            return true;
        }
        return false;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i <this.elemSize ; i++) {
            if(this.elem[i]==toFind){
                return true;
            }
        }
        return false; }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i <this.elemSize ; i++) {
            if(this.elem[i]==toFind){
                return i;
            }
        }
        System.out.println("没有找到对应元素");
        return -1; }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos>=0&&pos<=this.elemSize){
            return this.elem[pos];
        }
        System.out.println("下标元素不合法");
        return -1; }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos<0||pos>=this.elemSize){
            System.out.println("坐标不合法");
            return;
        }
        this.elem[pos]=value;

    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        for (int i = 0; i <this.elemSize ; i++) {
            if(this.elem[i]==toRemove){
                for (int j = i; j <this.elemSize-1 ; j++) {
                    this.elem[i]=this.elem[i+1];
                }
                this.elemSize--;
                return;
            }
        }

    }
    // 获取顺序表长度
    public int size() {
        if(this.elemSize>0){
            return this.elemSize;
        }
        return 0; }
    // 清空顺序表
    public void clear() {
        this.elemSize=0;
    }
}


