package Demo;

/**
 * @Author: 冰激凌
 * @Date: 2023-03-15 23:10
 **/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
//根据前序遍历和中序遍历构建二叉树
public class demo7 {
    int i = 0;
    public int findIndex(int[] vin,int key){
        for(int i = 0;i < vin.length ;i++){
            if(key == vin[i]){
                return i;
            }
        }
        return -1;
    }
    public TreeNode _reConstructBinaryTree(int[] pre,int[] vin,int left,int right){
        if(left > right){
            return null;
        }
        TreeNode node = new TreeNode(pre[i]);
        int mid = findIndex(vin,pre[i]);
        i++;
        node.left = _reConstructBinaryTree(pre,vin,left,mid-1);
        node.right = _reConstructBinaryTree(pre,vin,mid+1,right);
        return node;
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] vin) {
        return _reConstructBinaryTree(pre,vin,0,vin.length);
    }
}
