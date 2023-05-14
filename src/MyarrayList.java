

import java.util.Arrays;

public class MyarrayList {
    public int[] elem;//数组
    public int usedSize;//有效的数据个数

    public MyarrayList() {
        this.elem = new int[10];
        this.usedSize = 0;
    }

    //函数功能为判断数组中有效个数是否已满
    private boolean ifFull() {
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    //ifFull代码优化  可以直接返回判断语句执行后的boolean类型结果
//    private boolean ifFull(){
//        return (this.usedSize==this.elem.length);
//    }
    //输入一个下标 然后插入数组中
    public void add(int pos, int data) {
        if (ifFull()) {//调用函数判断是否满有效存储字符 如果满了就将数组扩容为2倍 之前数组将被内存回收
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
            //扩容 并且使得this.ekem重新指向新数组并将内容赋值到新数组中
        }
        if (!(pos < 0 || pos > usedSize)) {//如果pos为负数或者pos为大于数组可用总内存就不做
            int i = usedSize - 1;//下标i将被作为操作数组
            while (i >= pos) {//如果i<pos就停止循环 那么就找到了pos应该存放的下标
                this.elem[i + 1] = this.elem[i];//挪数据
                i--;//每次挪完将下标减一指向他前面的数字
            }
            this.elem[pos] = data;//放入要插入的数字
            this.usedSize++;//总计算有效数字个数加一
        }
        return;
    }

    //打印顺序表
    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (toFind == this.elem[i]) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        //1.顺序表是否为空 -1
        if (this.usedSize < 0) {
            return -1;
        }
        //2.pos的合法性
        if (!(pos >= 0 || pos < this.usedSize)) {
            return this.elem[pos];
        }
        return -1;
    }
//     // 给 pos 位置的元素设为 value
//         public void setPos(int pos, int value) { }
//     //删除第一次出现的关键字key
//         public void remove(int toRemove) { }
//     // 获取顺序表长度
//          public int size() { return 0; }
//     // 清空顺序表
//        public void clear() {  }
}