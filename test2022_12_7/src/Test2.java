

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Test2 {
    public boolean chkPalindrome(ListNode head) {
        // write code here
        if (head == null || head.next == null) return true;

        //找中间节点
        ListNode cur = head;
        ListNode cur1 = head;
        while (cur1 != null && cur1.next != null) {
            cur = cur.next;
            cur1 = cur1.next.next;
        }
        //反转后半段
        ListNode tmp = cur;
        cur = cur.next;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = tmp;
            tmp = cur;
            cur = curNext;
        }
        //比较是否为回文
        cur = tmp;
        cur1 = head;
        while (cur != cur1) {
            if (cur1.next == cur) {
                return true;
            }
            if (cur.val != cur1.val) {
                return false;
            }
            cur = cur.next;
            cur1 = cur1.next;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
