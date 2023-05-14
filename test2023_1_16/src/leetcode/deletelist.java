package leetcode;

import java.util.HashSet;

class ListNode {
    int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class deletelist {


    /**
     * 删除排序链表中的重复元素
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode cur=head;
        while(cur!=null){
            ListNode curNext=cur.next;
            while(curNext!=null&&curNext.val==cur.val){
                curNext=curNext.next;
            }
            cur.next=curNext;
            cur=cur.next;
        }
        return head;
    }
    /**
     * 两两交换链表中的节点
     * @param head
     * @param n
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode funnext=head.next.next;
        ListNode newHead=head.next;
        newHead.next=head;
        head.next=swapPairs(funnext);
        return newHead;
    }

    /**
     * 删除链表中的倒数第N个节点
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur1=head;
        ListNode cur2=head;
        while(n>0){
            cur2=cur2.next;
            n--;
        }
        ListNode prev=null;
        while(cur2!=null){
            prev=cur1;
            cur1=cur1.next;
            cur2=cur2.next;
        }
        if(prev!=null){
            prev.next=cur1.next;
        }else {
            head=head.next;
        }
        return head;
    }
}
