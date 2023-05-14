package Demo1;

import java.util.LinkedList;

public class Test {
    /**
     * 动态规划 连续子数集的最大值
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int[] f=new int[100000];
        f[0]=nums[0];
        int max=nums[0];
        int i=1;
        for(;i<nums.length;i++){
            f[i]=Math.max(f[i-1]+nums[i],nums[i]);
            max=Math.max(max,f[i]);
        }
        return max;
    }
    /**
     * 最小花费爬楼梯
     * @param cost
     * @return
     */
    public static int minCostClimbingStairs(int[] cost) {
        int i=0;
        int[] array=new int[1001];
        array[0]=array[1]=0;
        for(i=2;i<=cost.length;i++){
            array[i]=Math.min(cost[i-1]+array[i-1],cost[i-2]+array[i-2]);
        }
        return array[cost.length];
    }

    public static void main (String[] args) {
        int[] a={10,15,30};
        System.out.println(minCostClimbingStairs(a));
    }
    /**
     * 股票最大利润 动态规划
     * O(N)
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int[] array=new int[1001];
        array[0]=array[1]=0;
        int maxprice=0;
        int buymin=Integer.MAX_VALUE;
        for(int price:prices){
            if(buymin>price){
                buymin=price;
            }
            maxprice=Math.max(price-buymin,maxprice);
        }
        return maxprice;
    }
    public ListNode partition(ListNode head, int x) {
        // write code here
        ListNode cur=head;
        ListNode s1=null;
        ListNode s2=null;
        ListNode nodemin=null;
        ListNode nodemax=null;
        while(cur!=null){
            if(cur.val<x){
                if(s1==null){
                    s1=cur;
                    nodemin=s1;
                }else{
                    s1.next=cur;
                    s1=s1.next;
                }
            }else {
                if(s2==null){
                    s2=cur;
                    nodemax=s2;
                }else {
                    s2.next=cur;
                    s2=s2.next;
                }
            }
            cur=cur.next;
        }
        if(s2!=null){
            s2.next=null;
        }
        if(s1!=null){
            s1.next=nodemax;
        }else {
            return nodemax;
        }
        return nodemin;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a=0;
        int b=0;
        ListNode cura=headA;
        while(cura!=null){
            cura=cura.next;
            a++;
        }
        ListNode curb=headB;
        while(curb!=null){
            curb=curb.next;
            b++;
        }
        cura=headA;
        curb=headB;
        if(a>b){
            a=a-b;
            while(a>0){
                a--;
                cura=cura.next;
            }
        }else{
            b=b-a;
            while(b>0){
                b--;
                curb=curb.next;
            }
        }
        while(cura!=null){
            if(cura==curb){
                return cura;
            }
            cura=cura.next;
            curb=curb.next;
        }
        return null;
    }
    public boolean hasCycle(ListNode head) {
        ListNode cur=head;
        ListNode twoCur=head;
        while(twoCur!=null&&twoCur.next!=null){
            cur=cur.next;
            twoCur=twoCur.next.next;
            if(cur==twoCur){
                return true;
            }
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
    if(head==null)return null;
    ListNode cur=head;
    ListNode twoCur=head;
    while(twoCur!=null&& twoCur.next!=null){
        cur=cur.next;
        twoCur=twoCur.next.next;
        if(cur==twoCur){
            break;
        }
    }
    if(twoCur==null||twoCur.next==null){
        return null;
    }
    cur=head;
    while(cur!=twoCur){
        cur=cur.next;
        twoCur=twoCur.next;
    }
    return cur;
}
    public static void main1 (String[] args) {

    }
}
