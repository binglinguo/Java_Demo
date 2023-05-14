package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-17 23:55
 **/
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
}
//找到倒数第K个节点
public class demo4 {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        while(k > 0 && cur2 != null){
            k--;
            cur2 = cur2.next;
        }
        if(k > 0){
            return null;
        }
        while(cur2 != null && cur1 != null){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}
