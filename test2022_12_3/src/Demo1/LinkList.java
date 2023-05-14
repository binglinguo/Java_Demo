package Demo1;

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){}
    public ListNode(int val){
        this.val=val;
   }
}
public class LinkList {
        public ListNode head;
        public void Listeag() {
            //初始化链表中的值
            ListNode listNode1 = new ListNode(12);
            ListNode listNode2 = new ListNode(22);
            ListNode listNode3 = new ListNode(22);
            ListNode listNode4 = new ListNode(22);
            ListNode listNode5 = new ListNode(56);

            //串联链表 现在链表中的next都为null
            listNode1.next = listNode2;
            listNode2.next = listNode3;
            listNode3.next = listNode4;
            listNode4.next = listNode5;
            head=listNode1;
            //listNode5.next不需要
        }
        //头插法
        public void addFirst(int data){
            ListNode t=new ListNode(data);
            if(head==null) {
                head = t;
                return;
            }
            t.next=head;
            head=t;
        }
        //尾插法
        public void addLast(int data){
            ListNode t = new ListNode(data);
            if (head == null) {
                head = t;
                return;
            }
            ListNode cur = head;
            //寻找插入的位置
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next=t;
        }
        //任意位置插入,第一个数据节点为0号下标
        public void  addIndex(int index,int data){
            //判断下标的有效性
            if(index<0||index>size()+1){
                throw new IndexException("下标违法");
            }
            //寻找下标存放的位置
            ListNode cur=this.head;
            while(cur!=null&&index>1){
                cur=cur.next;
            }
            //插入节点
            ListNode t=new ListNode(data);
            t=cur.next;
            cur.next=t;

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
            while(cur!=null&&cur.next!=null){
                if(cur.next.val==key){
                    cur.next=cur.next.next;
                    return;
                }
                cur=cur.next;
            }
            if(head.val==key){
                head=head.next;
            }
        }
        //删除所有值为key的节点
        public void removeAllKey(int key){
            ListNode cur=this.head;
            while(cur!=null&&cur.next!=null){
                if(cur.next.val==key){
                    cur.next=cur.next.next;
                    continue;
                }
                cur=cur.next;
            }
            if (head.val == key) {
                head=head.next;
            }
        }
        //得到单链表的长度
        public int size(){
            ListNode cur=this.head;
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
                System.out.print(cur.val+"  ");
                cur=cur.next;
            }
        }
        public void clear(){
            ListNode cur=this.head;
            while(cur!=null){
                ListNode curNext=cur.next;
                cur=null;
                cur=curNext;
            }
            //head=null;
        }
}
