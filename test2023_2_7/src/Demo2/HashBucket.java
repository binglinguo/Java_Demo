package Demo2;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-07 21:12
 **/
public class HashBucket {
    private static class Node {
        private int key;
        private int value;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }


    private Node[]  array;
    private int usedSize;   // 当前的数据个数
    private static final double LOAD_FACTOR = 0.75;
    private static final int DEFAULT_SIZE = 10;//默认桶的大小

    public HashBucket() {
        // write code here
        this.array = new Node[DEFAULT_SIZE];
    }

    public void put(int key, int value) {
        // write code here
        //计算下标
        int index = key % array.length;
        //保存一个尾节点 如果该值不存在 那么可以使用保存的尾节点直接进行插入
        Node curPrev = null;
        //放入哈希表
        Node cur = array[index];
        //查看是否已存在 如果存在 修改其val值 否则进行尾插
        while(cur != null){
            curPrev = cur;
            if(cur.key == key){
                cur.value = value;
                return ;
            }else {//否则的话继续查找直到结束
                cur = cur.next;
            }
        }
        //如果执行完循环仍旧没有存在 则使用保存的尾节点进行尾插
        //插入完毕要将元素个数+1
        Node newCur = new Node(key,value);
        if(curPrev == null){
            array[index] = newCur;
        }else {
            curPrev.next = newCur;
        }

        this.usedSize++;
        //插入完毕 插入完毕后要检查负载因子
        //负载因子的计算公式为 uszdSize / 哈希表长度
        if(loadFactor() >= LOAD_FACTOR){
            resize();
        }
    }


    private void resize() {
        // write code here
        //创建一个新的哈希表 进行二倍扩容
        Node[] newarray = new Node[2 * array.length];
        for (int i = 0 ; i < array.length ; i++) {
            Node cur = array[i];
            while(cur != null){
                //使用一个节点保存cur的下一位 以免丢失
                Node curNext = cur.next;
                //进行重新哈希
                int index = cur.key % newarray.length;
                Node cur1 = newarray[index];
                while(cur1 != null && cur1.next != null){
                    cur1 = cur1.next;
                }
                if(cur1 == null){
                    newarray[index] = cur;
                }else {
                    cur1.next = cur;
                }
                cur = curNext;
            }
        }
        array = newarray;
    }


    private double loadFactor() {
        return usedSize * 1.0 / array.length;
    }





    public int get(int key) {
        // write code here
        int index = key % array.length;
        Node cur = array[index];
        while(cur != null){
            if(cur.key == key){
                return cur.value;
            }
            cur = cur.next;
        }
        return -1;
    }
}
