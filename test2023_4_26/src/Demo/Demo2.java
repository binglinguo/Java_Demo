package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-04-26 22:52
 **/
import java.util.*;
class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
}
//反转部分单向链表
public class Demo2 {
    public static Node bummerHead(Node prev,int left,int right){
        Node cur = prev.next;
        for(int i = left;i < right; i++){
            Node newCur = cur.next;
            cur.next = newCur.next;
            newCur.next = prev.next;
            prev.next = newCur;
        }
        return cur;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        String[] strs = str.split(" ");
        Node head = new Node(-1);
        Node cur = head;
        //创建好链表 带头链表
        for(String s : strs){
            Node node = new Node(Integer.parseInt(s));
            cur.next = node;
            cur = cur.next;
        }
        String ang = scanner.nextLine();
        String[] angs = ang.split(" ");
        int left = Integer.parseInt(angs[0]);
        int right = Integer.parseInt(angs[1]);
        //开始找要反转的第一个节点
        Node prev = head;
        for(int i = 1;i < left; i++){
            prev = prev.next;
        }
        Node newHead = bummerHead(prev,left,right);
        cur = head.next;
        //cur = prev;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }
}
