package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-18 17:02
 **/
//删除链表中的重复的节点
public class demo5 {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null){
            return pHead;
        }
        ListNode head = new ListNode(0);
        head.next = pHead;

        ListNode prev = head;
        ListNode last = prev.next;
        while(last != null){
            while(last.next != null && last.val != last.next.val){
                prev = prev.next;
                last = last.next;
            }
            while(last.next != null && last.val == last.next .val){
                last = last.next;
            }
            if(prev.next != last){
                prev.next = last.next;
            }
            last = last.next;
        }
        return head.next;
    }
}
