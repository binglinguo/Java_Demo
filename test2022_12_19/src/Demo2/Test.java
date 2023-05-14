package Demo2;

import java.util.Stack;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
      }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

public class Test {
    /**
     * 两个栈实现队列
     */
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();


    public void appendTail(int value) {
        s1.add(value);
    }

    public int deleteHead() {
        if(s1.isEmpty()){
            return -1;
        }
        int size=s1.size();
        while(size>1){
            int a=s1.pop();
            s2.push(a);
            size--;
        }
        int ret=s1.pop();
        while(!s2.isEmpty()){
            s1.add(s2.pop());
        }
        return ret;
    }
    /**
     * 实现最小栈
     */
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();


    public void push(int x) {
        stack1.push(x);
        if(stack2.isEmpty()){
            stack2.push(x);
        }else if(stack2.peek()>=x){
            stack2.push(x);
        }

    }

    public void pop() {
        if(stack1.isEmpty()){
            return ;
        }
        int n=stack1.pop();
        if(stack2.peek()==n){
            stack2.pop();
        }
    }

    public int top() {
        if(stack1.isEmpty()){
            return -1;
        }
        return stack1.peek();
    }

    public int min() {
        if(stack2.isEmpty()){
            return -1;
        }
        return stack2.peek();
    }
    /**
     * 删除链表的节点
     */
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val){
            head=head.next;
            return head;
        }
        ListNode cur=head;
        while(cur.next!=null&&cur.next.val!=val){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
    /**
     * 求二叉树的最小深度
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int leftn=minDepth(root.left);
        int rightn=minDepth(root.right);
        if(root.left==null||root.right==null){
            return leftn+rightn+1;
        }
        return leftn>rightn?rightn+1:leftn+1;
    }
}
