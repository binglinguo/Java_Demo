//
//
///**
// * /不带头单向链表
// */
//class ListNode {
//    public int val;
//    public ListNode1 next;
//
//    public ListNode(int val){
//        this.val=val;
//    }
//}
//public class MyLinkedList {
//
//    public ListNode head;//链表的头引用
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {//合并两个升序的链表
//        ListNode newHead=new ListNode(1);
//        ListNode red=newHead;
//        while(list1!=null&&list2!=null){
//            if(list1.val<list2.val){
//                red.next=list1;
//                list1=list1.next;
//                red=red.next;
//            }
//            else {
//                red.next=list2;
//                list2=list2.next;
//                red=red.next;
//            }
//        }
//        if(list1!=null){
//            red.next=list1;
//        }
//        else if(list2!=null){
//            red.next=list2;
//        }
//        return newHead.next;
//    }
//    public static void main(String[] args) {
//        ListNode listNode=new ListNode(1);
//   }
//
//    public void Listeag() {
//        //初始化链表中的值
//        ListNode listNode1 = new ListNode(12);
//        ListNode listNode2 = new ListNode(23);
//        ListNode listNode3 = new ListNode(34);
//        ListNode listNode4 = new ListNode(23);
//        ListNode listNode5 = new ListNode(56);
//
//        //串联链表 现在链表中的next都为null
//        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        head=listNode1;
//        //listNode5.next不需要
//    }
//    //实现链表的便历
//    public void Listplay() {
//        ListNode red=this.head;
//        while(red!=null){
//            System.out.print(red.val+" ");
//            red=red.next;
//        }
//        System.out.println();
//    }
//    //头插法
//    public void addFirst(int data){
//        ListNode red=new ListNode(data);
//        if(this.head==null){
//            this.head=red;
//        }else{
//            red.next=this.head;
//            this.head=red;
//        }
//    }
//    //尾插法
//    public void addLast(int data){
//        if(head==null){
//            addFirst(data);
//        }else {
//            ListNode red=head;
//            while(red.next!=null){
//                red=red.next;
//            }
//            ListNode flg=new ListNode(data);
//            red.next=flg;
//
//        }
//
//
//    }
//    //任意位置插入,第一个数据节点为0号下标
//    public void addIndex(int index,int data){
//        if(index<0||index>size()){
//            System.out.println("index下标不合法！插入失败！");
//            return ;
//        }
//        if(index==0){
//            addFirst(data);
//        }
//        if(size()==index){
//            addLast(data);
//        }
//        ListNode red=this.head;
//        while(index-1>0){
//            red=red.next;
//            index--;
//        }
//        ListNode flg=new ListNode(data);
//        flg.next=red.next;
//        red.next=flg;
//
//    }
//    //查找是否包含关键字key是否在单链表当中
//    public boolean contains(int key){
//        ListNode red=this.head;
//        while(red.next!=null){
//            if(red.val==key){
//                return true;
//            }
//            red=red.next;
//        }
//        return false;
//    }
//    //删除第一次出现关键字为key的节点
//    public void remove(int key){
//        if(this.head==null){
//            System.out.println("单链表为空，不能删除！");
//            return ;
//        }
//        if(this.head.val==key){
//            this.head=this.head.next;
//            return ;
//        }
//        ListNode red=this.head;
//        while(red.next!=null){
//            if(red.next.val==key){
//                red.next=red.next.next;
//                return ;
//            }
//            red=red.next;
//        }
//    }
//    //删除所有值为key的节点
//    public void removeAllKey(int key){
//        if(this.head==null) return ;
//        ListNode del=this.head;
//        ListNode cur=del.next;
//        while(cur!=null){
//            if(cur.val==key){
//                del.next=cur.next;
//                cur=cur.next;
//            }
//            else {
//                del=cur;
//                cur=cur.next;
//            }
//
//        }
//        //处理头节点
//        if(this.head.val==key){
//            head=head.next;
//        }
//    }
//    //得到单链表的长度
//    public int size(){
//        int count =0;
//        ListNode flg=this.head;
//        while(flg!=null){
//            count++;
//            flg=flg.next;
//        }
//        return count;
//    }
//    public void clear(){
//        //粗暴做法
//        //this.head=null;
//        //温柔做法
//        ListNode tur=this.head.next;
//        while(this.head!=null){
//            this.head.next=null;
//            this.head=tur;
//            tur=tur.next;
//        }
//    }
//    public void reverse(){//反转链表
//        ListNode tur=this.head.next;
//        ListNode del=this.head;
//        while(tur!=null){
//            ListNode tmp=tur.next;
//            tur.next=del;
//            del=tur;
//            tur=tmp;
//        }
//        //处理头节点
//        this.head.next=null;
//        this.head=del;
//    }
//    public void middleNode(){//寻找中间位置
//        ListNode del=this.head;
//        ListNode shor=this.head;
//        while(shor.next!=null&&shor.next.next!=null){
//            del=del.next;
//            shor=shor.next.next;
//        }
//            System.out.println(del.val);
//    }
//    public boolean chkPalindrome(ListNode A) {
//        if (A == null)return false;
//        // write code here
//        ListNode tmp = A;
//        reverse(tmp);
//        while (tmp != null && A != null) {
//            if (tmp.val != A.val) {
//                return false;
//            } else {
//                tmp = tmp.next;
//                A = A.next;
//            }
//
//        }
//        return true;
//    }
//    public void reverse(ListNode head) { //反转链表
//        ListNode tur = head.next;
//        ListNode del = head;
//        while (tur != null) {
//            ListNode tmp = tur.next;
//            tur.next = del;
//            del = tur;
//            tur = tmp;
//        }
//        //处理头节点
//        head.next = null;
//        head = del;
//    }
//
//    public void FindKthToTail(int k ) {//找出链表中倒数第K个值
//        // write code here
//        ListNode red=this.head;
//        ListNode del=this.head;
//        while(k-1>0&&red.next!=null){
//            red=red.next;
//            k--;
//        }
//        while(red.next!=null){
//            red=red.next;
//            del=del.next;
//        }
//        System.out.println(del.val);
//    }
//    public ListNode deleteDuplication(ListNode head) {//实现删除链表中有重复的节点
//        ListNode cur = head;
//        ListNode newHead = new ListNode(1);
//        ListNode tmp = newHead;
//        while (cur != null ) {
//            if (cur.next != null && cur.val == cur.next.val) {
//                while (cur != null && cur.next != null && cur.val == cur.next.val) {
//                    cur = cur.next;
//                }
//                //切记多走一步
//                cur = cur.next;
//            } else {
//                tmp.next = cur;
//                tmp = tmp.next;
//                cur = cur.next;
//            }
//        }
//        //为了防止最后一个节点为空或者防止head链表为空
//        tmp.next = null;
//        return newHead.next;
//    }
////    public boolean chkPalindrome(ListNode A) {
////        if (A == null)return false;
////        // write code here
////        ListNode tmp = A;
////        tmp=reverse(tmp);
////        while (tmp != null && A != null) {
////            if (tmp.val != A.val) {
////                return false;
////            } else {
////                tmp = tmp.next;
////                A = A.next;
////            }
////
////        }
////        return true;
////    }
////    public ListNode reverse(ListNode head) { //反转链表
////        ListNode tur = head.next;
////        ListNode del = head;
////        while (tur != null) {
////            ListNode tmp = tur.next;
////            tur.next = del;
////            del = tur;
////            tur = tmp;
////        }
////        //处理头节点
////        head.next = null;
////        return del;
////    }
//    public boolean chkPalindrome1(ListNode A){
//        ListNode cur=A;//中间节点 反转后的开端
//        ListNode tmp=A;
//        //找到中间节点
//        while(tmp.next!=null||tmp.next==null){
//            tmp=tmp.next.next;
//            cur=cur.next;
//        }
//        //反转后段链表
//        tmp=cur.next;
//        ListNode red=cur;//red代表头节点
//        while(tmp!=null){
//            ListNode cunCu=tmp.next;
//            tmp.next=red;
//            red=tmp.next;
//            tmp=cunCu;
//        }
//        //处理头节点
//        cur.next=null;
//        cur=red;
//        //判断是否为回文
//        while(cur!=A&&cur.next!=A){
//
//            if(cur.val!=A.val){
//                return false;
//            }
//            cur=cur.next;
//            A=A.next;
//        }
//        return true;
//    }
//    public ListNode detectCycle(ListNode head) {
//        ListNode p=head;//慢引用
//        ListNode p1=head;//快引用
//        boolean pos=false;
//        while(p1!=null&&p1.next!=null){
//            p=p.next;
//            p1=p1.next.next;
//            if(p==p1){
//                break;
//            }
//        }
//        if(p1!=null&&p1.next!=null){
//            pos=true;
//        }
//        else return null;
//        //找环入口
//        ListNode tmp=head;
//        while(tmp!=p){
//            tmp=tmp.next;
//            p=p.next;
//        }
//        return p;
//    }
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode heada=headA;
//        ListNode headb=headB;
//        int headan=0;//记录heada的长度
//        int headbn=0;//记录headb的长度
//        //让他们都走到最后一位 最后一位不计算 为了之后使用判断是否相交
//        while(heada.next!=null){
//            heada=heada.next;
//            headan++;
//        }
//        while(headb.next!=null){
//            headb=headb.next;
//            headbn++;
//        }
//        //判断是否相交 如果相交的话那么最后一位一定相同 反之则不同
//        if(heada!=headb){
//            return null;
//        }
//        heada=headA;
//        headb=headB;
//        //先让最长链表向后移动headan-headbn位
//        if(headan>=headbn){
//            while(headan-headbn>0){
//                headan--;
//                heada=heada.next;
//            }
//        } else {
//            while(headbn-headan>0){
//                headbn--;
//                headb=headb.next;
//            }
//        }
//        //开始共同移动 找到第一位相同的则为第一个交点
//        while(heada!=headb){
//            heada=heada.next;
//            headb=headb.next;
//        }
//        return heada;
//    }
//    public boolean hasCycle(ListNode head) {//判断链表是否有环
//        ListNode khead=head;
//        ListNode mhead=head;
//        while(khead!=null&&khead.next!=null){
//            khead=khead.next.next;
//            mhead=mhead.next;
//            if(khead==mhead){
//                return true;
//            }
//        }
//        return false;
//    }
////    public boolean hasCycle(ListNode head) {
////        ListNode khead=head;
////        ListNode mhead=head;
////        while(khead!=null&&khead.next!=null){
////            khead=khead.next.next;
////            mhead=mhead.next;
////            if(khead==mhead){
////                return true;
////            }
////        }
////        return false;
////    }
//}
