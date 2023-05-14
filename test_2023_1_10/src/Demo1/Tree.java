package Demo1;



class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (int val){
        this.val=val;
    }
}
class ListNode{
    int val;
    ListNode next;

}
public class Tree {
    public static void main (String[] args) {

    }
    /**
     * 从链表中删去总和值为零的连续节点
     */
    public ListNode removeZeroSumSublists(ListNode head) {
        if (head == null) return null;
        int sum = 0;
        for (ListNode cursor = head; cursor != null; cursor = cursor.next)
            if ((sum += cursor.val) == 0)
                return removeZeroSumSublists(cursor.next);
        head.next = removeZeroSumSublists(head.next);
        return head;
    }
}
