package Demo1;
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val){
        this.val=val;
    }
}
public class Test2 {
    public static ListNode partition(ListNode head, int x) {
        // write code here
        ListNode cur=head;
        ListNode s1=null;
        ListNode s2=null;
        ListNode nodemin=null;
        ListNode nodemax=null;
        while(cur!=null){
            if(cur.val<x){
                if(s1==null){
                    s1=cur;
                    nodemin=s1;
                }else{
                    s1.next=cur;
                    s1=s1.next;
                }
            }else {
                if(s2==null){
                    s2=cur;
                    nodemax=s2;
                }else {
                    s2.next=cur;
                    s2=s2.next;
                }
            }
            cur=cur.next;
        }
        if(s2!=null){
            s2.next=null;
        }
        if(s1!=null){
            s1.next=nodemax;
        }else {
            return nodemax;
        }
        return nodemin;
    }

    public static void main (String[] args) {

        ListNode cur1=new ListNode(6);
        ListNode cur2=new ListNode(5);
        ListNode cur3=new ListNode(4);
        ListNode cur4=new ListNode(3);
        ListNode cur5=new ListNode(2);
        ListNode cur6=new ListNode(1);
        ListNode head=cur1;
        cur1.next=cur2;
        cur2.next=cur3;
        cur3.next=cur4;
        cur4.next=cur5;
        cur5.next=cur6;
        ListNode cur=partition(head,3);
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }
}
