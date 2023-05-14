package leetcode;

import java.util.HashMap;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Solution {
    /**
     * 从链表中删去总和值为零的连续节点
     * @param head
     * @return
     */
    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer,ListNode> map=new HashMap<>();
        ListNode cur=head;
        int sum=0;
        map.put(0,new ListNode(-1,head));//链表带头了
        while(cur!=null){
            sum+=cur.val;
            if(map.containsKey(sum)){
                ListNode node=map.get(sum);
                ListNode del=node.next;
                node.next=cur.next;

                //删除要被删除的哈希值
                int n=sum;
                while(del!=cur){
                    n+=del.val;
                    map.remove(n);
                    del=del.next;
                }
            }else{
                map.put(sum,cur);
            }
            cur=cur.next;
        }
        return map.get(0).next;
    }
}
