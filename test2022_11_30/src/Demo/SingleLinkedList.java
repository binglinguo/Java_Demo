package Demo;

// 1、无头单向非循环链表实现
public class SingleLinkedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode head;
    //头插法
    public void addFirst(int data){
        ListNode cur=new ListNode(data);
        cur.next=this.head;
        this.head=cur;
    }
    //尾插法
    public void addLast(int data){
        ListNode cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        ListNode newNode =new ListNode(data);
        cur.next=newNode;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        //判断下标的有效性
        isFull(index);
        ListNode cur=this.head;
        int n=0;
        while(n<index-1){
            cur=cur.next;
        }
        ListNode newNode = new ListNode(data);
        newNode.next=cur.next;
        cur.next=newNode;
    }
    public boolean isFull(int index) throws IndexException{
        if(index<0||index>size()+1){
            throw new IndexException("下标违法！");
        }
        return true;
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
                cur.next=cur.next.next;
                return ;
            }
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
//        if(this.head==null)return ;
//        ListNode prev=this.head;
//        ListNode cur=prev.next;
//        while(cur!=null){
//            if(cur.val==key){
//                cur=cur.next;
//            }else{
//                prev.next=cur;
//                prev=cur;
//                cur=cur.next;
//            }
//        }
//        prev.next=null;
//        //处理头节点
//        if(this.head.val==key){
//            this.head=this.head.next;
//        }
        if(head == null) {
            return;
        }
        /*while(head.val == key) {
            head = head.next;
        }*/
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null) {
            if(cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(head.val == key) {
            head = head.next;
        }
    }
    //得到单链表的长度
    public int size(){
        ListNode cur = this.head;
        int count=0;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void clear(){
        ListNode cur=this.head;
        while(cur.next!=null){
            ListNode t=cur.next;
            cur=null;
            cur=t;
        }
        this.head=null;
    }
}
