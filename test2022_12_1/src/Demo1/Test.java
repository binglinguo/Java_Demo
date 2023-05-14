package Demo1;



class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Test {
    public boolean chkPalindrome(ListNode head) {
        // write code here
        if(head==null||head.next==null)return true;

        //找中间节点
        ListNode cur=head;
        ListNode cur1=head;
        while(cur1!=null&&cur1.next!=null){
            cur=cur.next;
            cur1=cur1.next.next;
        }
        //反转后半段
        ListNode tmp=cur;
        cur=cur.next;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=tmp;
            tmp=cur;
            cur=curNext;
        }
        //比较是否为回文
        cur=tmp;
        cur1=head;
        while(cur!=cur1){
            if(cur1.next==cur){
                return true;
            }
            if(cur.val!=cur1.val){
                return false;
            }
            cur=cur.next;
            cur1=cur1.next;
        }
        return true;
    }

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
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null)return head;
        if(k<=0)return null;
        ListNode cur=head;
        ListNode curs=head;
        while(k>0){
            if(curs==null){
                return null;
            }
            curs=curs.next;
            k--;


        }
        while(curs!=null){
            cur=cur.next;
            curs=curs.next;
        }
        return cur;
    }
    public ListNode middleNode(ListNode head) {
        if(head==null)return head;
        ListNode cur=head;
        ListNode curs=head;
        while(curs!=null&&curs.next!=null){
            cur=cur.next;
            curs=curs.next.next;
        }
        return cur;
    }
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

}
