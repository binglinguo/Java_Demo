package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-18 09:37
 **/
//反转链表
class ListNode {
    int val;
    ListNode next = null;

    ListNode (int val) {
        this.val = val;
    }
}
public class demo1 {
    public ListNode ReverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode cur = head.next;
        head.next = null;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
    }
}
