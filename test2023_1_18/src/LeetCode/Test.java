package LeetCode;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.PriorityQueue;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Test {

    /**
     * 第二优解 使用归并排序 因为归并排序的时间复杂度为O(NlogN) 但是空间复杂度仍旧超过限制 空间复杂度O(logN)
     * 自顶向下归并排序
     */
    public ListNode sortList(ListNode head) {
        return mergerSortList(head,null);
    }
    public ListNode mergerSortList(ListNode head,ListNode tail){
        if(head==null){
            return head;
        }
        if(head.next==tail){
            head.next=null;
            return head;
        }
        //找到中间节点
        ListNode mid=findListNode(head,tail);
        ListNode list1=mergerSortList(head,mid);
        ListNode list2=mergerSortList(mid,tail);
        ListNode list=merger(list1,list2);
        return list;
    }

    public ListNode merger(ListNode list1,ListNode list2){
        ListNode list=new ListNode();
        ListNode s1=list1;
        ListNode s2=list2;
        ListNode cur=list;
        while(s1!=null && s2!=null){
            if(s1.val <= s2.val){
                cur.next=s1;
                s1=s1.next;
                cur=cur.next;
            }else {
                cur.next=s2;
                s2=s2.next;
                cur=cur.next;
            }
        }
        if(s1!=null){
            cur.next=s1;
        }
        if(s2!=null){
            cur.next=s2;
        }
        return list.next;
    }

    public ListNode findListNode(ListNode head,ListNode tail){
        ListNode cur1=head;
        ListNode cur2=head;
        //cur1每次移动一步  cur2每次移动两步
        while(cur2!=tail&&cur2.next!=tail){
            cur1=cur1.next;
            cur2=cur2.next.next;
        }
        if(cur2!=tail){
            cur2=cur2.next;
        }
        return cur1;
    }
   /*惜败  如果链表存在有重复元素的haunt排序不成功 因为根据HashMap的特性会去重
   public ListNode sortList(ListNode head) {
        if(head==null)return head;
        HashMap<Integer,ListNode> map=new HashMap<>();
        int min=head.val;
        int max=head.val;
        ListNode cur=head;
        while(cur!=null){
            if(cur.val<min){
                min=cur.val;
            }
            if(cur.val>max){
                max=cur.val;
            }
            map.put(cur.val,cur);
            cur=cur.next;
        }
        ListNode list=new ListNode();
        cur=list;
        while(min<=max){
            if(map.get(min)!=null){
                cur.next=map.get(min);
                cur=cur.next;
            }
            min++;
        }
        cur.next=null;
        return list.next;
    }*/
    /**
     * 方法1  TOPK问题方式解决 创建小根堆
     * 时间复杂度O(N*logN）
     * 空间复杂度O(N)
     * @param head
     * @return
     */
    /*public static ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> queue=new PriorityQueue<>((s1,s2)->{return s1.val-s2.val;});
        ListNode cur=head;
        while(cur!=null){
            queue.offer(cur);
            cur=cur.next;
        }
        ListNode list=new ListNode();
        ListNode cur1=list;
        while(!queue.isEmpty()){
            cur1.next=queue.poll();
            cur1=cur1.next;
        }
        cur1.next=null;
        return list.next;
    }*/

    /**
     * 使用选择排序的思路排序 挂在前一位节点太难找
     *
     * @param args
     */
    /*error
    public ListNode sortList(ListNode head) {
        if(head==null)return null;
        ListNode list=new ListNode();
        ListNode listCur=list;
        ListNode headCur=head;
        while(headCur!=null){
            ListNode min=headCur;
            ListNode j=headCur.next;
            while(j!=null){
                if(min.val>j.val){
                    min=j;
                }
                j=j.next;
            }
            listCur.next=min;
            listCur=listCur.next;
            headCur=headCur.next;
        }
        listCur.next=null;
        return list.next;
    }error*/

//    public static void main1 (String[] args) {
//        ListNode A=new ListNode(4);
//        ListNode B=new ListNode(2);
//        ListNode C=new ListNode(1);
//        ListNode D=new ListNode(3);
//
//        A.next=B;
//        B.next=C;
//        C.next=D;
//        ListNode cur=sortList(A);//这边会报错 因为不是静态的方法
//        while(cur!=null){
//            System.out.print(cur.val+" ");
//            cur=cur.next;
//        }
//    }
    /**
     * 合并两个有序数组 二路归并
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=nums1.length-1;
        m--;
        n--;
        while(m>=0&&n>=0){
            if(nums1[m]>=nums2[n]){
                nums1[j--]=nums1[m--];
            }else {
                nums1[j--]=nums2[n--];
            }
        }
        while(n>=0){
            nums1[j--]=nums2[n--];
        }
    }
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int j=nums1.length-1;
        int nums1n=m-1;
        int nums2n=n-1;
        while(nums1n>=0&&nums2n>=0){
            if(nums1[nums1n]>=nums2[nums2n]){
                nums1[j]=nums1[nums1n];
                j--;
                nums1n--;
            }else {
                nums1[j]=nums2[nums2n];
                j--;
                nums2n--;
            }
        }
        while(nums1n>=0&&j>=0){
            nums1[j]=nums1[nums1n];
            j--;
            nums1n--;
        }
        while(nums2n>=0&&j>=0){
            nums1[j]=nums2[nums2n];
            j--;
            nums2n--;
        }

    }
    /**
     * 最后一个单词的长度
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int count=0;
        while(s.charAt(i)==' '&&i>=0){
            i--;
        }
        for(; i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            count++;
        }
        return count;
    }
    /**
     * 最后一个单词的长度解法2
     *     public int lengthOfLastWord(String s) {
     *         String arr[]=s.split(" ");
     *         int count=0;
     *         for(int i=0;i<arr[arr.length-1].length();i++){
     *             count++;
     *             if(arr[arr.length-1].charAt(i)==' '){
     *                 break;
     *             }
     *         }
     *         return count;
     *     }
     */
}
