package Demo1;
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val){
        this.val=val;
    }
}
public class Tree {
    public void _invertTree(TreeNode root){
        if(root==null){
            return ;
        }
        TreeNode t=root.left;
        root.left=root.right;
        root.right=t;
        _invertTree(root.left);
        _invertTree(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        _invertTree(root);
        return root;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null||subRoot==null){
            return false;
        }
        if(isSameTree(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);

    }
    public boolean isSameTree(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        return isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right);
    }
    TreeNode find(TreeNode root,int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        TreeNode left=find(root.left,val);
        if(left!=null){
            return left;
        }
        TreeNode right=find(root.right,val);
        if(right!=null){
            return right;
        }
        return null;
    }
//    public boolean isBalanced(TreeNode root) {
//        if(root==null){
//            return true;
//        }
//        int leftn=Treecount(root.left);
//        int rightn=Treecount(root.right);
//        if(Math.abs(leftn-rightn)>1){
//            return false;
//        }
//        return isBalanced(root.left)&&isBalanced(root.right);
//    }
        public boolean isBalanced(TreeNode root) {
            return _isBalanced(root)!=-1;
        }
    public int _isBalanced(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftn=_isBalanced(root.left);
        if(leftn==-1){
            return -1;
        }
        int rightn=_isBalanced(root.right);
        if(rightn==-1){
            return -1;
        }
        if(Math.abs(leftn-rightn)<=1) {
            return Math.max(leftn,rightn)+1;
        }else{
            return -1;
        }

    }
    public int Treecount(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftn=Treecount(root.left);
        int rightn=Treecount(root.right);
        return leftn>rightn?leftn+1:rightn+1;
    }
}

