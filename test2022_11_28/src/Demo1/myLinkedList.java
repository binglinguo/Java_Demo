package Demo1;


public class myLinkedList {
    public int val;
    public myLinkedList prev;//存储上一位的地址
    public myLinkedList next;//存储下一位的地址

    public myLinkedList head;//head永远指向链表头部
    public myLinkedList last;//last永远指向链表尾部

    public myLinkedList(){

    }
    public myLinkedList(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }

    //新增一个链表
    public void add(int data){
        myLinkedList ret=new myLinkedList(data);
        if(this.head==null){
            head=ret;
            last=ret;
        }
        myLinkedList cur=this.head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=ret;
        last=last.next;
    }

    //头删法
    public void leftdelete(){
        if(this.head!=null){
            head=head.next;
            head.prev=null;
        }
    }
}
