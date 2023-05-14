package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-18 11:10
 **/
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
//树的子结构
public class demo3 {
    public boolean isTree(TreeNode root1,TreeNode root2){
        if(root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        return isTree(root1.left,root2.left) && isTree(root1.right,root2.right);
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val == root2.val){
            if(isTree(root1,root2)){
                return true;
            }
        }
        return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }
//    //查找是否是同一颗子树
//    public boolean isTree(TreeNode root1,TreeNode root2){
//        if(root1 == null && root2 == null){
//            return true;
//        }
//        if(root2 == null){
//            return true;
//        }
//        if(root1 == null ){
//            return false;
//        }
//        if(root1.val != root2.val ){
//            return false;
//        }
//        return isTree(root1.left,root2.left) && isTree(root1.right,root2.right);
//    }
//    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
//        if(root1 == null && root2 == null){
//            return false;
//        }
//        if(root1 == null || root2 == null){
//            return false;
//        }
//        if(root1.val == root2.val){
//            if(isTree(root1,root2)){
//                return true;
//            }
//        }
//        return HasSubtree(root1.left,root2)|| HasSubtree(root1.right,root2);
//    }
}
