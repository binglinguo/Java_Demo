package Demo1;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表(力扣带循环)
 */
public class Test {
    public  Node prev=null;
    public  void inorderTree(Node root){
        if(root==null){
            return ;
        }
        inorderTree(root.left);
        root.left=prev;
        if(prev!=null){
            prev.right=root;
        }
        prev=root;
        inorderTree(root.right);

    }
    public Node treeToDoublyList(Node root) {
        if(root==null){
            return null;
        }
        inorderTree(root);
        Node head=root;
        while(head.left != null){
            head=head.left;
        }
        Node last=root;
        while(last.right!=null){
            last=last.right;
        }
        last.right=head;
        head.left=last;
        return head;
    }
}
