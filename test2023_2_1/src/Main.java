/**
 * @Author: guo bing lin
 * @Date: 2023-02-01 21:13
 **/
import java.util.*;
class TreeNode{
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char val){
        this.val=val;
    }
}

// 注意类名必须为 Main, 不要有任何 package xxx 信息
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
