package Demo2;

public class Test2 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return root;
        TreeNode cur=root;
        TreeNode prev=null;
        while(cur!=null){
            if(cur.val==key){
                delete(root,cur,prev);
                return root;
            }else if(cur.val<key){
                prev=cur;
                cur=cur.right;
            }else {
                prev=cur;
                cur=cur.left;
            }
        }
        return root;
    }
    public void delete(TreeNode root,TreeNode prev,TreeNode cur){
        if(cur.left==null){
            if(cur==root){
                root=cur.right;
            }else if(cur==prev.left){
                prev.left=cur.right;
            }else {
                prev.right=cur.right;
            }
        }else if(cur.right==null){
            if(cur==root){
                root=cur.left;
            }else if(cur==prev.left){
                prev.left=cur.left;
            }else {
                prev.right=cur.left;
            }
        }else {
            TreeNode targer=cur.right;
            TreeNode targerprev=cur;
            while(targer.left!=null){
                targerprev=targer;
                targer=targer.left;
            }
            cur.val=targer.val;
            if(targerprev.right==targer){
                targerprev.left=targer.right;
            }else {
                targerprev.right=targer.right;
            }
        }
    }
}
