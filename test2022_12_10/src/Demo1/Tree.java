package Demo1;

import java.util.Scanner;

class TreeNode1{
    public char val;
    public TreeNode1 left;
    public TreeNode1 right;

    public TreeNode1(char val){
        this.val=val;
    }
}

/**
 * 给定一颗二叉树的前序遍历的结果，构建这课二叉树，再使用中序遍历将其打印
 */
public class Tree {
    public static int i=0;
    public static TreeNode1 creatTree(String str){
        TreeNode1 root=null;
        if(str.charAt(i)!='#'){
            root=new TreeNode1(str.charAt(i));
            i++;
            root.left=creatTree(str);
            root.right=creatTree(str);
        }
        else {
            i++;
        }
        return root;
    }
    public static void inorderTreeNode(TreeNode1 root){
        if(root==null){
            return ;
        }
        inorderTreeNode(root.left);
        System.out.print(root.val+" ");
        inorderTreeNode(root.right);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str=in.nextLine();
            TreeNode1 root=creatTree(str);
            inorderTreeNode(root);
        }
    }


}

