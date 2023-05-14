package Demo1;

import java.util.HashMap;
import java.util.Stack;

public class Test {
    /**
     *移除重复的节点
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null){
            return head;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        ListNode Index=head;
        map.put(head.val,1);
        ListNode cur=head.next;
        while(cur!=null){
            if(map.getOrDefault(cur.val,0)==1){
                cur=cur.next;
            }else{
                map.put(cur.val,1);
                Index.next=cur;
                cur=cur.next;
                Index=Index.next;
            }
        }
        Index.next=null;
        return head;
    }
    /**
     * 逆序打印链表
     */
    /*
    递归
     public int i=0;
    public void _reversePrint(ListNode head,int[] array){
        if(head==null){
            return ;
        }
        _reversePrint(head.next,array);
        array[i++]=head.val;
    }
    public int[] reversePrint(ListNode head) {
        ListNode cur=head;
        int size=0;

        while(cur!=null){
            cur=cur.next;
            size++;
        }
        int[] array=new int[size];
        _reversePrint(head,array);
        return array;
    }
     */
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack=new Stack<>();
        int size=0;
        ListNode cur=head;
        while(cur!=null){
            stack.push(cur);
            size++;
            cur=cur.next;
        }
        int[] array=new int[size];
        int i=0;
        while(!stack.isEmpty()){
            array[i]=stack.pop().val;
            i++;
        }
        return array;
    }
    /**
     * 转轮数组
     */
    public void reverse(int[] arr,int row,int right){
        if(right>=arr.length)return ;
        while(row<right){
            int tmp=arr[row];
            arr[row]=arr[right];
            arr[right]=tmp;
            row++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length-1);//3 2 1
        reverse(nums,0,k%nums.length-1);//
        reverse(nums,k%nums.length,nums.length-1);//
    }
    /**
     * 移除数字
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
