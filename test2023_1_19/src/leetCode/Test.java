package leetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Test {
    /**
     * 下一个更大的元素
     * 时间复杂度O(N+M)
     * 空间复杂度O(N)
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty()&&nums2[i]>stack.peek()){
                stack.pop();
            }
            //存储关系
            map.put(nums2[i],stack.isEmpty()?-1:stack.peek());
            stack.push(nums2[i]);
        }
        int[] ret=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ret[i]=map.get(nums1[i]);
        }
        return ret;
    }

    /**
     * 下一个更大的元素
     * 时间复杂度O(N^2)
     */
    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map1=new HashMap<>();
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
            map1.put(i,nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            int j=map.get(nums1[i]);
            for(;j<nums2.length;j++){
                if(map1.get(j)>nums1[i]){
                    arr[i]=map1.get(j);
                    break;
                }
            }
            if(j==nums2.length){
                arr[i]=-1;
            }
        }
        return arr;
    }
    /**
     * 用栈操作构建数组
     */
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new LinkedList<>();
        int j=0;
        for(int i=1;i<=n;i++){
            list.add("Push");
            if(i!=target[j]){
                list.add("Pop");
            }else {
                j++;
            }
            if(j==target.length){
                break;
            }
        }
        return list;
    }
    /**
     * 链表环的入口
     */
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode cur1=head;
        ListNode cur2=head;
        while(cur2!=null&&cur2.next!=null){
            cur1=cur1.next;
            cur2=cur2.next.next;
            if(cur1==cur2){
                break;
            }
        }
        if(cur2==null||cur2.next==null){
            return null;
        }
        cur2=head;
        while(cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }
    /**
     * 反转链表
     */
    public ListNode reverseList(ListNode head) {
        if(head==null)return head;
        ListNode cur=head.next;
        head.next=null;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=head;
            head=cur;
            cur=curNext;
        }
        return head;
    }
    /**
     * 删除链表中重复的节点
     */
    public ListNode deleteDuplication(ListNode head) {
        //
        ListNode cur = head;
        ListNode newHead = new ListNode(1);
        ListNode tmp = newHead;
        while (cur != null ) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur != null && cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            } else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }
    /**
     * 奇偶链表
     */
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode o=head;
        //表示奇链表的头
        ListNode e=head.next;
        //表示偶链表的尾
        ListNode t=e;
        while(o.next!=null&&e.next!=null){
            o.next=e.next;
            o=o.next;
            e.next=o.next;
            e=e.next;
        }
        o.next=t;
        return head;
    }
    /**
     * 链表二路归并
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tmp=new ListNode();
        ListNode cur=tmp;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                cur.next=list1;
                cur=cur.next;
                list1=list1.next;
            }else {
                cur.next=list2;
                cur=cur.next;
                list2=list2.next;
            }
        }
        if(list1==null){
            cur.next=list2;
        }
        if(list2==null){
            cur.next=list1;
        }
        return tmp.next;
    }
}
