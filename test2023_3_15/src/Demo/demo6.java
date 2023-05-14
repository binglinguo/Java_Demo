package Demo;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-15 22:43
 **/
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}
//从尾到头打印链表
public class demo6 {
    //方法2 递归
    public void _printListFromTailToHead(ArrayList<Integer> list,ListNode cur){
        if(cur == null){
            return ;
        }
        _printListFromTailToHead(list,cur.next);
        list.add(cur.val);
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        _printListFromTailToHead(list,listNode);
        return list;
    }
    //方法1
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        Stack<ListNode> stack = new Stack<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        ListNode cur = listNode;
//        while(cur != null){
//            stack.push(cur);
//            cur = cur.next;
//        }
//        while(!stack.isEmpty()){
//            list.add(stack.pop().val);
//        }
//        return list;
//    }
}
