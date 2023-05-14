package Demo1;
class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        }
public class Test2 {

    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return head;
        ListNode prev=head;
        ListNode cur=head.next;
        while(cur!=null){
            if(cur.val==val){
                cur=cur.next;
            }else {
                prev.next=cur;
                prev=cur;
                cur=cur.next;
            }
        }
        prev.next=null;
        if(head.val==val){
            head=head.next;
        }
        return head;
    }
}
