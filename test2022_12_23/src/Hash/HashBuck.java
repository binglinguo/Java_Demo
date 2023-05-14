package Hash;

import java.util.Objects;

public class HashBuck {

    static class Node{
        public int key;
        public int val;
        public Node next;

        public Node(int key,int val){
            this.key=key;
            this.val=val;
        }

        @Override
        public boolean equals (Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return key == node.key && val == node.val && Objects.equals(next , node.next);
        }

        @Override
        public int hashCode () {
            return Objects.hash(key , val , next);
        }
    }
    public Node[] array=new Node[10];
    public int usedSize;
    public static final double DEFAULT_LOAD=0.75;

    public void put(int key,int val){
        Node node=new Node(key,val);
        //1.确定下标
        int index=key%this.array.length;
        if(this.array[index]==null){
            this.array[index]=node;
            this.usedSize++;
            if(loadFactor()>=DEFAULT_LOAD){
                resize();
            }
            return ;
        }

        //2.遍历这个下标的链表 看看是否有重复的key 如果有的话修改val
        Node cur=this.array[index];
        while(cur!=null){
            if(cur.key==key){
                cur.val=val;
                return ;
            }
            cur=cur.next;
        }

        //3.如果不存在，那么找到他要存放的位置
        cur=this.array[index];
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
        this.usedSize++;

        //4.判断如果超过负载因子，那么要进行扩容
        if(loadFactor()>=DEFAULT_LOAD){
            resize();//注意：此时的扩容不是简单的扩容，而是要将array整个数组重新哈希
        }
    }
    private double loadFactor(){
        return 1.0*this.usedSize/this.array.length;
    }

    private void resize(){
        Node[] ret=new Node[this.array.length*2];//二倍扩容
        for (int i = 0 ; i < this.array.length ; i++) {
            if(this.array[i]!=null){
                Node cur=this.array[i];
                while(cur!=null){
                    Node curnext=cur.next;
                    int index=cur.key%ret.length;
                    if(ret[index]==null){
                        ret[index]=cur;
                        cur.next=null;
                        cur=curnext;
                        continue;
                    }
                    Node cur1=cur;
                    while(cur1.next!=null){
                        cur1=cur1.next;
                    }
                    cur1.next=cur;
                    cur.next=null;
                    cur=curnext;
                }
            }
        }
        this.array=ret;
    }

    public static void main (String[] args) {
        HashBuck hashBuck=new HashBuck();
        hashBuck.put(1,1);
        hashBuck.put(2,1);
        hashBuck.put(3,1);
        hashBuck.put(4,1);
        hashBuck.put(5,1);
        hashBuck.put(6,1);
        hashBuck.put(7,1);
        hashBuck.put(11,1);


        System.out.println();
    }




//    static class Node{
//        public int key ;
//        public int val ;
//        public Node next ;
//
//        public Node(int key,int val){
//            this.key=key;
//            this.val=val;
//        }
//        }
//    public Node[] array;
//    public int uszeSize;
//
//    public HashBuck(){
//        array=new Node[10];
//    }
//
//    public static final double DEFAULT_LAOD = 0.75;
//    public void put(int key,int val){
//        //1.找到下标
//        int index=key%this.array.length;
//
//        Node ret=new Node(key,val);
//        if(array[index]==null){
//            array[index]=ret;
//            this.uszeSize++;
//            double s=loadFactor();
//            if(s>=DEFAULT_LAOD){
//                resize();
//            }
//            return ;
//        }
//
//        //2.找有没有相同的值，如果有则更新值的val
//        Node cur=array[index];
//        while(cur!=null){
//            if(cur.key==key){
//                cur.val=val;
//                this.uszeSize++;
//                if(loadFactor()>=DEFAULT_LAOD){
//                    resize();
//                }
//                return ;
//            }
//            cur=cur.next;
//        }
//
//        //3.如果没有进行尾插
//        cur=array[index];
//        while(cur.next!=null){
//            cur=cur.next;
//        }
//        cur.next=ret;
//        this.uszeSize++;
//
//        //4.插入后检查当前哈希表的负载因子
//        double s=loadFactor();
//        if(s>=DEFAULT_LAOD){
//            resize();
//        }
//    }
//    //扩容 每次扩容要将之前数组重新哈希到一个新的数组中
//    private void resize(){
//        Node[] ret = new Node[this.array.length*2];
//        this.uszeSize=0;
//        for (int i = 0 ; i < this.array.length ; i++) {
//            if(array[i]!=null){
//                Node cur=array[i];
//                while(cur!=null){
//                    int index=cur.key%ret.length;
//                    Node newnode=new Node(cur.key,cur.val);
//                    if(ret[index]==null){
//                        ret[index]=newnode;
//
//                        break;
//                    }
//                    Node awm=cur;
//                    while(awm.next!=null){
//                        awm=awm.next;
//                    }
//                    awm.next=newnode;
//                    cur=cur.next;
//                }
//
//                this.array=ret;
//                this.uszeSize++;
//            }
//        }
//    }
//
//    private double loadFactor(){
//        return 1.0*this.uszeSize/this.array.length;
//    }
//
//    public static void main (String[] args) {
//        HashBuck hashBuck=new HashBuck();
//        hashBuck.put(1,1);
//        hashBuck.put(2,2);
//        hashBuck.put(3,3);
//        hashBuck.put(4,4);
//        hashBuck.put(5,5);
//        hashBuck.put(6,6);
//        hashBuck.put(7,3);
//        hashBuck.put(2,2);
//        hashBuck.put(11,11);
//        hashBuck.put(21,1);
//        hashBuck.put(41,2);
//        hashBuck.put(8,8);
//
//
//        System.out.println();
//
//    }
}
