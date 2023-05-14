package Demo1;


import java.util.HashMap;
import java.util.Map;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class test {
    /**
     * 复杂链表的复制
     */
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        Node cur=head;
        while(cur!=null){
            Node node=new Node(cur.val);
            map.put(cur,node);
            cur=cur.next;
        }
        cur=head;
        Node ret=map.get(head);
        while(cur!=null){
            ret.next=map.get(cur.next);
            ret.random=map.get(cur.random);
            cur=cur.next;
            ret=ret.next;
        }
        return map.get(head);
    }
    /**
     * 反转链表
     */
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode cur=head.next;
        head.next=null;
        while(cur!=null){
            ListNode curnext=cur.next;
            cur.next=head;
            head=cur;
            cur=curnext;
        }
        return head;
    }
    /**
     * 从头到尾打印链表
     */
    public int[] reversePrint(ListNode head) {
        int size=0;
        ListNode ret=head;
        while(ret!=null){
            ret=ret.next;
            size++;
        }
        int[] array=new int[size];
        ListNode cur=head;
        size--;
        while(cur!=null){
            array[size--]=cur.val;
            cur=cur.next;
        }
        return array;
    }
}
