package Demo1;

class BTNode{
    public char val;
    public BTNode left;
    public BTNode right;

    public BTNode (char val){
        this.val=val;
    }
}

public class Binarytree {
    public  BTNode initalization(){
        BTNode A=new BTNode('A');
        BTNode B=new BTNode('B');
        BTNode C=new BTNode('C');
        BTNode D=new BTNode('D');
        BTNode E=new BTNode('E');
        BTNode F=new BTNode('F');
        BTNode G=new BTNode('G');
        BTNode H=new BTNode('H');
        A.left=B;
        A.right=C;
        B.left=D;
        B.right=E;
        C.left=F;
        C.right=G;
        E.right=H;

        return A;
    }
    // 前序遍历
    void preOrder(BTNode root){
        if(root==null){
            return ;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    // 中序遍历
    void inOrder(BTNode root){
        if (root == null) {
            return ;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    // 后序遍历
    void postOrder(BTNode root){
        if (root == null) {
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
}
