package Demo1;

import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}



public class Test {

    /**
     * 换键盘打字
     * str1:期望输入的
     * str2:实际输入的
     * @param args
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();
        for(char ch:str2.toUpperCase().toCharArray()){
            set1.add(ch);
        }
        for(char ch:str1.toUpperCase().toCharArray()){
            if(!set1.contains(ch)&&!set2.contains(ch)){
                System.out.print(ch);
                set2.add(ch);
            }
        }
    }
    /**
     * 宝石与石头
     * @param jewels
     * @param stones
     * @return
     */
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }

    /**
     * 复制带随机指针的链表
     */
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        Node cur=head;
        while(cur!=null){
            Node ret=new Node(cur.val);
            map.put(cur,ret);
            cur=cur.next;
        }
        cur=head;
        Node ret=map.get(cur);
        while(cur!=null){
            ret.next=map.get(cur.next);
            ret.random=map.get(cur.random);
            cur=cur.next;
            ret=ret.next;
        }
        return map.get(head);
    }
}
