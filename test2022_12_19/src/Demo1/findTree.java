package Demo1;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node(int val){
        this.val=val;
    }
}

public class findTree {
    public static Node root=null;
    //插入元素
    public static boolean insert(int key){
        if(root==null){
            root=new Node(key);
            return true;
        }
        Node cur=root;
        Node parent=null;
        while(cur!=null){
            if(cur.val==key){
                return false;
            }
            parent=cur;
            if(cur.val<key){
                cur=cur.right;
            }else {
                cur=cur.left;
            }
        }
        cur=new Node(key);
        if(cur.val>parent.val){
            parent.right=cur;
        }else {
            parent.left=cur;
        }
        return true;
    }
    //查找数据
    public static Node search(int key){
        Node cur=root;
        while(cur!=null){
            if(cur.val==key){
                return cur;
            }else {
                if(cur.val<key){
                    cur=cur.right;
                }else {
                    cur=cur.left;
                }
            }
        }
        return null;
    }

    public static void remove(int key){
        Node cur=root;
        Node parent=null;
        while(cur!=null){
            if(cur.val==key){
              removeNode(cur,parent);
            } else if(cur.val<key){
                parent=cur;
                cur=parent.right;
            }else {
                parent=cur;
                cur=cur.left;
            }
        }
    }
    public static void  removeNode(Node cur,Node parent){
        if(cur.left==null){
            if(cur==root){
                root=cur.right;
            }else if(parent.left==cur){
                parent.left=cur.right;
            }else {
                parent.right=cur.right;
            }
        }else if(cur.right==null){
            if(cur==root){
                root=cur.left;
            }else if(parent.left==cur){
                parent.left=cur.left;
            }else {
                parent.right=cur.left;
            }
        }else {
            Node tmp=cur;
            Node tap=cur;
            cur=cur.left;
            while(cur.right!=null){
                tap=cur;
                cur=cur.right;
            }
            tap.right=cur.left;
            cur.left=tmp.left;
            cur.right=tmp.right;
            parent.left=cur;
        }
    }
}
