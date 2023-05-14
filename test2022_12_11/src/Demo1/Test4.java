package Demo1;

public class Test4 {
    /**
     * 根据二叉树创建字符串
     */
    public void TreeToString(TreeNode root,StringBuilder sb){
        if(root==null){
            return ;
        }

        sb.append(root.val);
        if(root.left!=null){
            sb.append("(");
        }

        TreeToString(root.left,sb);
        if(root.left!=null){
            sb.append(")");
        }
        if(root.left==null&&root.right!=null){
            sb.append("()");
        }
        if(root.right!=null){
            sb.append("(");
        }
        TreeToString(root.right,sb);
        if(root.right!=null){
            sb.append(")");
        }
    }
    public String tree2str(TreeNode root) {
        if(root==null){
            return null;
        }
        StringBuilder sb= new StringBuilder();
        TreeToString(root,sb);
        return sb.toString();
    }
}
