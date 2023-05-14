package Code;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-22 23:24
 **/
//返回两个链表的公共节点
class ListNode{
    int val;
    ListNode next;
}
public class demo11 {
    public int size (ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }
        int size1 = size(pHead1);
        int size2 = size(pHead2);
        int n = Math.abs(size1 - size2);
        if(size1 > size2){
            while(n > 0){
                pHead1 = pHead1.next;
                n--;
            }
        }else {
            while(n > 0){
                pHead2 = pHead2.next;
                n--;
            }
        }
        while(pHead1 != null && pHead2 != null ){
            if(pHead1 == pHead2){
                return pHead1;
            }
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }
}
