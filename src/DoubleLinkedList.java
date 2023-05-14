/**
 * 不带头双向链表
 */
class ListNode{
    public int val;
    public ListNode prev;
    public ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}

public class DoubleLinkedList {
    public ListNode head;//双链表的头引用
    public ListNode last;//双链表的尾引用
    public void Listeag(){
        ListNode listnode1=new ListNode(12);
        ListNode listnode2=new ListNode(12);
        ListNode listnode3=new ListNode(12);
        ListNode listnode4=new ListNode(45);
        ListNode listnode5=new ListNode(56);

        listnode5.prev=listnode4;
        listnode4.prev=listnode3;
        listnode3.prev=listnode2;
        listnode2.prev=listnode1;
        listnode1.prev=null;


        listnode1.next=listnode2;
        listnode2.next=listnode3;
        listnode3.next=listnode4;
        listnode4.next=listnode5;
        listnode5.next=null;

        this.head=listnode1;
        this.last=listnode5;
    }
    //头插法
    public void addFirst(int data) {
        ListNode cur = new ListNode(data);
        if (this.head == null) {
            this.head = cur;
            this.last = cur;
            return;
        } else {
            this.head.prev = cur;
            cur.next = this.head;
            this.head = cur;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode cur=new ListNode(data);
        if(this.head==null){
            this.head=cur;
            this.last=cur;
        }else {
            this.last.next=cur;
            cur.prev=this.last;
            this.last=cur;
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        ListNode node =new ListNode(data);
        ListNode cur=this.head;
        System.out.println(size());
        if(index<0||index>size()){
            System.out.println("下标非法！");
            return ;
        }
        if(index==0){
            addFirst(data);
            return ;
        }
        if(index==size()){
            addLast(data);
            return ;
        }
        while(index>0){
            index--;
            cur=cur.next;
        }
        ListNode tmp=cur.prev;
        node.next=cur;
        node.prev=tmp;
        tmp.next=node;
        cur.prev=node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                if(cur==this.head){
                    this.head=cur.next;
                    if(this.head!=null){
                        cur.next.prev=null;
                    }else {
                        this.last=null;
                    }
                }else if(cur==this.last){
                    cur.prev.next=null;
                    this.last=cur;
                }else {
                    cur.prev.next=cur.next;
                    cur.next.prev=cur.prev;
                }
                return ;
            }else {
                cur=cur.next;
            }
        }
        System.out.println("没有要删除的节点");
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                if(cur==this.head){
                    this.head=cur.next;
                    if(this.head!=null){
                        cur.next.prev=null;
                    }else {
                        this.last=null;
                    }
                }else if(cur==this.last){
                    cur.prev.next=null;
                    this.last=cur;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
            }
                cur=cur.next;
            }
        }

    //得到双链表的长度
    public int size(){
        int count=0;
        ListNode cur=this.head;
        while(cur!=null){
            cur=cur.next;
            count++;
        }

        return count;
    }
    //输出打印链表值
    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //置空链表
    public void clear(){
        /**
         * 暴力做法
         * this.head=null;
         * this.last=null;
         * 不推荐使用暴力做法
         */

        while(this.head!=null){
            ListNode cur=this.head.next;
            this.head.prev=null;
            this.head.next=null;
            this.head=cur;
        }
        this.last=null;
    }
}
