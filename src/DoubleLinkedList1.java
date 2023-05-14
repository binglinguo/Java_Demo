/**
 * 带头双向链表
 */
class ListNode1{
    public int val;
    public ListNode1 prev;
    public ListNode1 next;

    public ListNode1(int val){
        this.val=val;
    }
}

public class DoubleLinkedList1 {
    public ListNode1 head=new ListNode1(-1);
    public ListNode1 last=head;

    // 2、有头双向链表实现
        //头插法
        public void addFirst(int data){
            ListNode1 cur=new ListNode1(data);
            cur.next=this.head.next;
            this.head.next=cur;
            cur.prev=this.head;
            if(this.head==this.last){
                this.last=head.next;
            }
        }
        //尾插法
        public void addLast(int data){
            ListNode1 cur=new ListNode1(data);
            cur.next=this.last.next;
            cur.prev=this.last;
            this.last.next=cur;
            this.last=cur;
        }
        //任意位置插入,第一个数据节点为0号下标
        public void addIndex(int index,int data){
            if(index<0||index>size()){
                System.out.println("下标不合法!插入失败");
                return ;
            }
            if(index==0){
                addFirst(data);
              //  System.out.println(1);
                return ;
            }
            if(index==size()){
                addLast(data);
              //  System.out.println(2);
                return ;

            }
            ListNode1 del=new ListNode1(data);
            ListNode1 cur=this.head.next;
            while(index>0){
                index--;
                cur=cur.next;
            }
            //找到要插入的下标
            //System.out.println(3);
            del.next=cur;
            del.prev=cur.prev;
            cur.prev=del;
            del.prev.next=del;
        }
        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key){
            ListNode1 cur=this.head.next;
            while(cur!=null){
                if(cur.val==key){
                    return true;
                }
                cur=cur.next;
            }
            return false;}
        //删除第一次出现关键字为key的节点
        public void remove(int key){
            ListNode1 cur=this.head.next;
            while(cur!=null&&cur.next!=null){
                if(cur.val==key){
                    //删除节点操作
                    cur.next.prev=cur.prev;
                    cur.next.prev.next=cur.next;
                    cur=null;
                    return ;
                }else{
                    cur=cur.next;
                }
            }
            this.last=this.last.prev;
            this.last.next=null;
        }
        //删除所有值为key的节点
        public void removeAllKey(int key){
            ListNode1 cur=this.head.next;
            while(cur!=null&&cur.next!=null){
                if(cur.val==key){
                    //删除节点操作
                    cur.next.prev=cur.prev;
                    cur.next.prev.next=cur.next;
                    cur=cur.next;
                }else{
                    cur=cur.next;
                }
            }
            if(this.last.val==key){
                this.last=this.last.prev;
                this.last.next=null;
            }

        }
        //得到单链表的长度
        public int size(){
            int count=0;
            ListNode1 cur=this.head.next;
            while(cur!=null){
                count++;
                cur=cur.next;
            }
            return count;}
            //输出链表内容
        public void display(){
            if(this.head==null){
                System.out.println(this.head);
                return ;
            }
            ListNode1 cur=this.head.next;
            while(cur!=null){
                System.out.print(cur.val+" ");
                cur=cur.next;
            }
            System.out.println();
        }
        //清空链表
        public void clear(){
            //暴力
//            this.head=null;
//            this.last=null;
            ListNode1 cur=this.head;
            while(cur!=null&&cur.next!=null){
                ListNode1 tmp=cur.next;
                cur=null;
                cur=tmp.next;
            }
            this.head=null;
            this.last=null;
        }

}
