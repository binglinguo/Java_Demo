package Demo1;

/**
 * 哈希桶模拟实现
 */
public class HashBuck {
    static class Node{
        public int key;
        public int val;
        public Node next;

        public Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    public Node[] array;
    public int usedSize;
    public HashBuck(){
        array=new Node[10];
    }

}
