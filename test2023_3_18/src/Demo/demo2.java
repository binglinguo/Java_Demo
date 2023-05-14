package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-18 09:46
 **/
//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode (int val) {
//        this.val = val;
//    }
//}
//合并两个有序链表
public class demo2 {
    //递归版本
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode cur = list1.val <= list2.val ? list1 : list2;
        if (cur == list1) {
            list1 = list1.next;
        } else {
            list2 = list2.next;
        }
        cur.next = Merge(list1,list2);
        return cur;
    }
    //迭代版本
    public ListNode Merge1(ListNode list1, ListNode list2) {
        if (list1 == null ) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode head = null;
        ListNode headp = null;
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                if (head == null) {
                    head = cur1;
                    headp = head;
                } else {
                    head.next = cur1;
                    head = head.next;
                }
                cur1 = cur1.next;
            } else {
                if (head == null) {
                    head = cur2;
                    headp = head;
                } else {
                    head.next = cur2;
                    head = head.next;
                }
                cur2 = cur2.next;
            }
        }
        if (cur1 != null) {
            head.next = cur1;
        }
        if (cur2 != null) {
            head.next = cur2;
        }
        return headp;
    }
}
