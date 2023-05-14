
import java.util.*;
class TreeNode{
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char val){
        this.val=val;
    }
}

/**
 * 给定一颗二叉树的前序遍历的结果，构建这课二叉树，再使用中序遍历将其打印
 */
public class Main {
    public static int i=0;
    public static TreeNode creatTree(String str){
        TreeNode root=null;
        if(str.charAt(i)!='#'){
            root=new TreeNode(str.charAt(i));
            i++;
            root.left=creatTree(str);
            root.right=creatTree(str);
        }
        else {
            i++;
        }
        return root;
    }
    public static void inorderTreeNode(TreeNode root){
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
            TreeNode root=creatTree(str);
            inorderTreeNode(root);
        }
    }
}
