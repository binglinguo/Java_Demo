package Demo1;

import sun.awt.image.ImageWatched;

import java.util.List;

class LinkNode{
    public int val;
    public LinkNode prev;
    public LinkNode next;

    public LinkNode(int val){
        this.val=val;
    }
}


// 2、无头双向链表实现
public class LinkdeLIst {
    public LinkNode head;
    public LinkNode last;
    //头插法
    public void addFirst(int data){
        LinkNode cur=new LinkNode(data);
        if(this.head==null){
            this.head=cur;
            this.last=cur;
        }else {
            cur.next=this.head;
            this.head.prev=cur;
            head=cur;
        }
    }
    //尾插法
    public void addLast(int data){
        LinkNode cur=new LinkNode(data);
        if(this.last==null){
            this.head=cur;
            this.last=cur;
        }else{
            this.last.next=cur;
            cur.prev=last;
            last=cur;
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        if(index<0||index>size()){
            return false;
        }
        if(index==0){
            addFirst(data);
            return true;
        }else if(index==size()){
            addLast(data);
            return true;
        }
        LinkNode tmp=new LinkNode(data);
        LinkNode cur=this.head;
        while(index>0){
            cur=cur.next;
            index--;
        }
        tmp.next=cur;
        tmp.prev=cur.prev;
        tmp.prev.next=tmp;
        cur.prev=tmp;
        return true;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        LinkNode cur=this.head;
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
        LinkNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                if(cur==this.head){
                    this.head=this.head.next;
                    if(this.head!=null){
                        this.head.prev=null;
                    }
                }else{
                    cur.prev.next=cur.next;
                    if(cur!=this.last){
                        cur.next.prev=cur.prev;
                    }else{
                        this.last=this.last.prev;
                    }
                }
                return ;
            }
            cur=cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        LinkNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                if(cur==this.head){
                    this.head=this.head.next;
                    if(this.head!=null){
                        this.head.prev=null;
                    }
                }else{
                    cur.prev.next=cur.next;
                    if(cur!=this.last){
                        cur.next.prev=cur.prev;
                    }else{
                        this.last=this.last.prev;
                    }
                }
            }
            cur=cur.next;
        }

    }
    //得到单链表的长度
    public int size(){
        int count=0;
        LinkNode cur=head;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
    public void display(){
        LinkNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void clear(){
        LinkNode cur=this.head;
        while(cur!=null){
            LinkNode tmp=cur.next;
            cur.prev=null;
            cur.next=null;
            cur=tmp;
        }
        head=null;
        last=null;
    }


    public static void main (String[] args) {
        LinkdeLIst list=new LinkdeLIst();
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        //list.addFirst(12);
       // list.addLast(8);
        list.display();
        System.out.println("==========");
        list.removeAllKey(1);
        list.display();

    }
}

