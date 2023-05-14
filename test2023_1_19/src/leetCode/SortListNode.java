package leetCode;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SortListNode {
    public static ListNode sortList(ListNode head){
        ListNode cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        //传入第一位
        quickSort(head,cur);
        return head;
    }

    public static void quickSort(ListNode head,ListNode tail){
        if(head==null||head.next==null||head==tail){
            return ;
        }
        ListNode i=head.next;
        ListNode j=head.next;
        ListNode i_prvio=head;
        while(j!=null){
            if(j.val<head.val){
                swap(j,i);
                i_prvio=i;
                i=i.next;
            }
            j=j.next;
        }
        swap(head,i_prvio);
        quickSort(head,i_prvio);
        quickSort(i,tail);
    }

    public static void swap(ListNode cur1,ListNode cur2){
        int t=cur1.val;
        cur1.val=cur2.val;
        cur2.val=t;
    }
    public static void main (String[] args) {
        ListNode A=new ListNode(4);
        ListNode B=new ListNode(2);
        ListNode C=new ListNode(1);
        ListNode D=new ListNode(3);

        A.next=B;
        B.next=C;
        C.next=D;
        ListNode cur=sortList(A);//这边会报错 因为不是静态的方法
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
    }

}
