package Demo2;

/**
 * @Author: guo bing lin
 * @Date: 2023-02-07 22:54
 **/
public class HashBucket2<K,V>{
    private static class Node<K,V>{
        public K key;
        public V value;
        public Node<K,V> next;

        public Node(K key,V value){
            this.key = key;
            this.value = value;
        }
    }

    private Node<K,V>[] array =(Node<K,V>[]) new Node[10];
    private int usedSize;
    public static final double LOAD_FACTOR = 0.75;

    public void put(K key,V value){
        int hash = key.hashCode();
        int index = hash % array.length;
        Node<K,V> cur = array[index];
        while(cur != null){
            if(cur.key.equals(key)){
                cur.value = value;
                return ;
            }else {
                cur = cur.next;
            }
        }
        Node<K,V> newCur = new Node<>(key,value);
        newCur.next = array[index];
        array[index] = newCur;
        usedSize++;
        if(usedSize * 1.0 / array.length >= LOAD_FACTOR){
            //重新哈希
        }
    }

    public V get(K key){
        int hash = key.hashCode();
        int index = hash % array.length;
        Node<K,V> cur = array[index];
        while(cur != null){
            if(cur.key.equals(key)){
                return cur.value;
            }else {
                cur = cur.next;
            }
        }
        return null;
    }
}
